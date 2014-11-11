package com.sppl.training.proxy;

import java.lang.reflect.Proxy;

public class BusinessFactory {
	private Handler handler;
	public BusinessFactory(Handler handler) {
		this.handler = handler;
	}
	public static BusinessIntf createBusiness(Handler handler) {
		BusinessIntf business = null;
		Class[] interfaces = {BusinessIntf.class};
		ClassLoader loader = BusinessIntf.class.getClassLoader();
		business = (BusinessIntf)Proxy.newProxyInstance(loader, interfaces, handler);
		return business;
	}
}
