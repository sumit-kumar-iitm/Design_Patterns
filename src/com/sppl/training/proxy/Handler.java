package com.sppl.training.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Handler implements InvocationHandler{
	private BusinessImpl impl;
	
	public Handler(BusinessImpl impl) {
		super();
		this.impl = impl;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Starting Transaction");
		//Class[] interfaces = {BusinessImpl.class};
		//Object obj = Proxy.newProxyInstance(this.getClass().getClassLoader(), interfaces, this);
		String retValue=(String)method.invoke(impl, args);
		System.out.println("Ending Transaction");
		return retValue;
	}
	
}
