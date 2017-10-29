package com.it.chen.thread.exercise;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestDemo {
		private Object target;
		public TestDemo(Object target) {
			this.target=target;
		}
		public Object getProxyInstance() {
			Object proxy=null;
			ClassLoader loader=target.getClass().getClassLoader();
			Class<?>[] interfaceList =target.getClass().getInterfaces();
			InvocationHandler invo=new InvocationHandler() {
				@Override
				public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
					System.out.println("代理了");
					method.invoke(target, args);
					System.out.println("代理后");
					return 0;
				}
			};
			proxy=Proxy.newProxyInstance(loader,interfaceList,invo);
			return proxy;
		}
}
