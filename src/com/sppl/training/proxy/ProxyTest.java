package com.sppl.training.proxy;

public class ProxyTest {
	public static void main(String[] args) {
		BusinessImpl impl = new BusinessImpl();
		Handler handler = new Handler(impl);
		BusinessIntf business = BusinessFactory.createBusiness(handler);
		System.out.println(business.process());
	}
}

// in VM arguments ---to save the generated files
//-Dsun.misc.ProxyGenerator.saveGeneratedFiles=true