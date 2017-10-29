package com.it.chen.thread.exercise;

public class Cllient {
	public static void main(String[] args) {
		TestDemo testDemo = new TestDemo(new AppTest());
		IAppTest proxyInstance = (IAppTest) testDemo.getProxyInstance();
		proxyInstance.add(6);
	}
}
