package com.study.demo.designModel;

import com.study.demo.designModel.proxy.Proxy;
import com.study.demo.designModel.proxy.Sourceable;

public class ProxyTest {

	public static void main(String[] args) {
		Sourceable source=new Proxy(); 
		source.method();
	}
}
