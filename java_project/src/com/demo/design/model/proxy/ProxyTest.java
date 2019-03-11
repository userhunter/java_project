package com.demo.design.model.proxy;

public class ProxyTest {
	
	public static void test() {
//		IComputer  computer = (IComputer)Proxy.newProxyInstance(IComputer.class.getClassLoader(),
//				new Class<?>[]{IComputer.class},new ProxyComputer(new DetailComputer()));
		
		ProxyComputer proxyComputer = new ProxyComputer();
		IComputer computer = (IComputer) proxyComputer.getInstance(new DetailComputer());
		computer.buyCpu("intel");
	}

}
