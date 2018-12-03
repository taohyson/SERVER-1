
package com.xianyi.framework.core.transport.netty.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;


public final class SecureSslContextFactory {

    private static final String PROTOCOL = "TLS";
    private static SSLContext SERVER_CONTEXT;
    private static SSLContext CLIENT_CONTEXT;

    public static SSLContext getServerContext() {
    	return SERVER_CONTEXT;
    }

    public static SSLContext getServerContext(String tlsMode, String serverCER_Path,  String serverTrustCERPath, String sPassword) 
    {
    	System.out.println("getServerContext :" + serverCER_Path + "|||" + serverTrustCERPath);
    	
		if (SERVER_CONTEXT == null)
		{
		    InputStream in = null;
		    InputStream tIN = null;
		    try 
		    {
				// Set up key manager factory to use our key store
				KeyManagerFactory kmf = null;
				if (serverCER_Path != null) 
				{
				    KeyStore ks = KeyStore.getInstance("JKS");
				    in = new FileInputStream(serverCER_Path);
				    System.out.println("getServerContext AAA:"+serverCER_Path);
				    ks.load(in, sPassword.toCharArray());
				    System.out.println("getServerContext BBB");
				    kmf = KeyManagerFactory.getInstance("SunX509");
				    System.out.println("getServerContext CCC");
				    kmf.init(ks, sPassword.toCharArray());
				    System.out.println("getServerContext DDD");
				}
				
				TrustManagerFactory tmf = null;
				if (serverTrustCERPath != null) 
				{
				    KeyStore tks = KeyStore.getInstance("JKS");
				    tIN = new FileInputStream(serverTrustCERPath);
				    System.out.println("getServerContext EEE");
				    tks.load(tIN, sPassword.toCharArray());
				    System.out.println("getServerContext FFF");
				    tmf = TrustManagerFactory.getInstance("SunX509");
				    System.out.println("getServerContext GGG");
				    tmf.init(tks);
				    System.out.println("getServerContext HHH");
				}
				// Initialize the SSLContext to work with our key managers.
				SERVER_CONTEXT = SSLContext.getInstance(PROTOCOL);
				if (SSLMODE.CA.toString().equals(tlsMode)) {
				    SERVER_CONTEXT.init(kmf.getKeyManagers(), null, null);
				}
				else if (SSLMODE.CSA.toString().equals(tlsMode)) {
				    SERVER_CONTEXT.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
				    System.out.println("SERVER_CONTEXT INIT OK");
				} else {
				    throw new Error( "Failed to initialize the server-side SSLContext"  + tlsMode);
				}
		    } catch (Exception e) {
		    	e.printStackTrace();
		    	throw new Error("Failed to initialize the server-side SSLContext", e);
		    } finally {
				if (in != null)
				    try {
				    	in.close();
				    } catch (IOException e) {
				    	e.printStackTrace();
				    }
				in = null;
				if (tIN != null)
				    try {
				    	tIN.close();
				    } catch (IOException e) {
				    	e.printStackTrace();
				    }
				tIN = null;
		    }
		}
		return SERVER_CONTEXT;
    }

    public static SSLContext getClientContext() {
    	return CLIENT_CONTEXT;
    }

    public static SSLContext getClientContext(String tlsMode, String clientCER_Path,  String clientTrustCERPath, String sPassword)
    {
		if (CLIENT_CONTEXT == null) 
		{
		    InputStream in = null;
		    InputStream tIN = null;
		    try
		    {
				// Set up key manager factory to use our key store
				KeyManagerFactory kmf = null;
				if (clientCER_Path != null) 
				{
				    KeyStore ks = KeyStore.getInstance("JKS");
				    in = new FileInputStream(clientCER_Path);
				    ks.load(in, sPassword.toCharArray());
				    // ks.load(in, "123456".toCharArray());
				    kmf = KeyManagerFactory.getInstance("SunX509");
				    kmf.init(ks, sPassword.toCharArray());
				    // kmf.init(ks, "123456".toCharArray());
				}
		
				// Set up trust manager factory to use our key store
				// TrustManagerFactory tmf = TrustManagerFactory
				// .getInstance("SunX509");
				// tmf.init(ks);
				TrustManagerFactory tmf = null;
				if (clientTrustCERPath != null) 
				{
				    KeyStore tks = KeyStore.getInstance("JKS");
				    tIN = new FileInputStream(clientTrustCERPath);
				    tks.load(tIN, sPassword.toCharArray());
				    tmf = TrustManagerFactory.getInstance("SunX509");
				    tmf.init(tks);
				}
				// Initialize the SSLContext to work with our key managers.
				CLIENT_CONTEXT = SSLContext.getInstance(PROTOCOL);
				if (SSLMODE.CA.toString().equals(tlsMode)) {
				    CLIENT_CONTEXT.init(null,  tmf == null ? null : tmf.getTrustManagers(), null);
			    }
				else if (SSLMODE.CSA.toString().equals(tlsMode)) 
				{
				    CLIENT_CONTEXT.init(kmf.getKeyManagers(),  tmf.getTrustManagers(), null);
				} else {
				    throw new Error( "Failed to initialize the client-side SSLContext" + tlsMode);
				}
		    } catch (Exception e) {
		    	e.printStackTrace();
				throw new Error("Failed to initialize the client-side SSLContext", e);
		    }
		    finally 
		    {
				if (in != null)
				    try {
				    	in.close();
				    } catch (IOException e) {
				    	e.printStackTrace();
				    }
				in = null;
		    }
		}
		return CLIENT_CONTEXT;
    }
}
