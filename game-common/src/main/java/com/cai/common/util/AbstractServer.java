/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cai.common.define.EServerType;
import com.google.common.base.Strings;
import com.xianyi.framework.core.transport.Acceptor;
import com.xianyi.framework.core.transport.event.IOEventListener;
import com.xianyi.framework.core.transport.netty.NettySocketAcceptor;
import com.xianyi.framework.core.transport.netty.session.C2SSession;

import io.netty.util.Version;

/**
 * 服务器进程抽象
 *
 * @author wu_hc
 */
public abstract class AbstractServer implements Lifecycle {

	/**
	 *
	 */
	protected final Logger log = LoggerFactory.getLogger(getClass());

	/**
	 *
	 */
	protected static final String FUN_LOG = "ICAgICAgICAgICAgICAgICAgIF9vb09vb18KICAgICAgICAgICAgICAgICAgbzg4ODg4ODhvCiAgICAgICAgICAgICAgICAgIDg4IiAuICI4OAogICAgICAgICAgICAgICAgICAofCAtXy0gfCkKICAgICAgICAgICAgICAgICAgT1wgID0gIC9PCiAgICAgICAgICAgICAgIF9fX18vYC0tLSdcX19fXwogICAgICAgICAgICAgLicgIFxcfCAgICAgfC8vICBgLgogICAgICAgICAgICAvICBcXHx8fCAgOiAgfHx8Ly8gIFwKICAgICAgICAgICAvICBffHx8fHwgLTotIHx8fHx8LSAgXAogICAgICAgICAgIHwgICB8IFxcXCAgLSAgLy8vIHwgICB8CiAgICAgICAgICAgfCBcX3wgICcnXC0tLS8nJyAgfCAgIHwKICAgICAgICAgICBcICAuLVxfXyAgYC1gICBfX18vLS4gLwogICAgICAgICBfX19gLiAuJyAgLy0tLi0tXCAgYC4gLiBfXwogICAgICAuIiIgJzwgIGAuX19fXF88fD5fL19fXy4nICA+JyIiLgogICAgIHwgfCA6ICBgLSBcYC47YFwgXyAvYDsuYC8gLSBgIDogfCB8CiAgICAgXCAgXCBgLS4gICBcXyBfX1wgL19fIF8vICAgLi1gIC8gIC8KPT09PT09YC0uX19fX2AtLl9fX1xfX19fXy9fX18uLWBfX19fLi0nPT09PT09CiAgICAgICAgICAgICAgICAgICBgPS0tLT0nCl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXl5eXgogICAgICAgICAgICAgICAgIOS9m+elluS/neS9kSAgICAgICDmsLjml6BCVUc=";

	/**
	 * 服务器实例
	 */
	private static AbstractServer server;

	/**
	 * 进程id
	 */
	private final int pid;

	/**
	 * 服务器当前状态
	 */
	private ServerStatus status = ServerStatus.NONE;

	/**
	 *
	 */
	private Acceptor acceptor;

	/**
	 * 服务器类型
	 */
	private EServerType serverType;

	protected AbstractServer() {
		Runtime.getRuntime().addShutdownHook(new ShutdownHook());

		// 获得当前进程ID
		RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
		System.out.println(runtimeMXBean.getName());
		pid = Integer.valueOf(runtimeMXBean.getName().split("@")[0]).intValue();

		server = this;
	}

	@SuppressWarnings("unchecked")
	public static final <T extends AbstractServer> T getServer() {
		return (T) server;
	}

	@Override
	public void start() throws Exception {
		this.initConfig();
		this.printSystemInfo();
		this.startSpring();
		this.startService();

		this.afterInitCfg();
	}

	/**
	 * 获取当前进程ID
	 *
	 * @return
	 */
	public int getProcessID() {
		return pid;
	}

	@Override
	public boolean isRunning() {
		return status == ServerStatus.RUNING;
	}

	/**
	 * 初始化配置
	 */
	protected void initConfig() {

		PropertyConfigurator.configureAndWatch(WRSystem.HOME + "config/log4j.properties", 5000);
		PropertiesUtil prop = new PropertiesUtil(WRSystem.HOME + "config/config.properties");
		config(prop);
	}

	/**
	 * 打印系统参数
	 */
	protected void printSystemInfo() {
		luckLog();
		ServerListenUtil.sysInfo();
	}

	/**
	 * 启动spring
	 */
	protected void startSpring() {
		SpringService.start();
	}

	/**
	 * 初始化网络接收器
	 *
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	protected void startAcceptor(int port) throws Exception {
		NettySocketAcceptor acceptor = new NettySocketAcceptor(port);
		initAcceptor(acceptor);
		Class<? extends IOEventListener<C2SSession>> acceptorBehaviour = acceptorListener();
		acceptor.listener().add(acceptorBehaviour.newInstance());
		acceptor.doInit();
		acceptor.start(false);
		this.acceptor = acceptor;
		log.info("Netty service start success,listening at port[{}]!!!", port);
	}

	private void luckLog() {
		try {
			String luck = new String(Base64.decodeBase64(FUN_LOG), "utf-8");
			System.out.println(luck);

			final Map<String, Version> nettyVersion = io.netty.util.Version.identify();
			System.out.println("netty version:" + nettyVersion);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the acceptor
	 */
	@SuppressWarnings("unchecked")
	public <T extends Acceptor> T getAcceptor() {
		return (T) acceptor;
	}

	/**
	 * 测试用
	 */
	protected final void openDebug() {
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("开发命令输入监听启动");
				while (true) {

					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						String str = br.readLine();
						if (Strings.isNullOrEmpty(str)) {
							continue;
						}
						debugCmdAccept(str);

						TimeUnit.MILLISECONDS.sleep(500L);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
		t2.start();

	}

	private final class ShutdownHook extends Thread {

		@Override
		public void run() {
			try {
				status = ServerStatus.STOPING;
				AbstractServer.this.stop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	protected void initAcceptor(Acceptor acceptor) {
	}

	/**
	 * 配置
	 *
	 * @param prop
	 */
	protected abstract void config(final PropertiesUtil prop);

	/**
	 * 启动服务
	 *
	 * @throws Exception
	 */
	protected void startService() throws Exception {

	}

	/**
	 * 网络接收器行为
	 *
	 * @return
	 */
	protected abstract Class<? extends IOEventListener<C2SSession>> acceptorListener();

	/**
	 * 测试
	 *
	 * @param cmd
	 */
	protected void debugCmdAccept(final String cmd) {
	}

	public EServerType getServerType() {
		return serverType;
	}

	public void setServerType(EServerType serverType) {
		this.serverType = serverType;
	}

	/**
	 * 初始化之后
	 */
	protected void afterInitCfg() throws Exception {

	}

	public static enum ServerStatus {
		NONE, RUNING, STOPING
	}
}
