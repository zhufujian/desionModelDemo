package com.study.demo.designModel.bridge;

public class MyBridge extends Bridge {

	public void method(){
		getSourceable().method();
	}
}
