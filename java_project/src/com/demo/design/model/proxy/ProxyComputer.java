package com.demo.design.model.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyComputer implements InvocationHandler{
	
	private Object mDetail;
	public Object getInstance(Object target) {
		mDetail = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object obj, Method method, Object[] arg2) throws Throwable {
		System.out.println("before");
		method.invoke(mDetail, arg2);  // 反射调用
		System.out.println("after");
		
		return obj;
	}
}
