package com.it.chen.dynamic.proxy;

public class Cllient {
	public static void main(String[] args) {
		TestDemo testDemo = new TestDemo(new AppTest());
		IAppTest proxyInstance = (IAppTest) testDemo.getProxyInstance();
		proxyInstance.add(6);
	}
}
