package com.it.chen.dynamic.proxy;

/**
 * Unit test for simple App.
 */
public class AppTest implements IAppTest{
	private int count=1;
	@Override
	public int add(int a) {
		System.out.println(count+a);
		return count+a;
	}
}
