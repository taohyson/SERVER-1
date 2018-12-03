package com.cai.common.util;

import java.util.ServiceLoader;

import com.xianyi.framework.core.transport.Session;

public final class ServiceLoaderTest {

	public static void main(String[] args) {


		System.setProperty("user.dir",System.getProperties().getProperty("user.dir") + "/" + "game-common");
		System.out.printf(System.getProperties().getProperty("user.dir"));
		ServiceLoader<Session> loader = ServiceLoader.load(Session.class);

		for(Session service : loader){
			System.out.println(service.getClass());
		}
	}
}

