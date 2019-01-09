package com.study.demo.relationModel.state;

/**
 * 
*
* @Description: 状态类的核心类
* @ClassName: State 
* @author zhufj
* @date 2019年1月9日 下午4:38:14 
*
 */
public class State {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	public void method1(){
		System.out.println("execute the method1 !");
	}
	
	public void method2(){
		System.out.println("execute the method2 !");
	}

	
	
}
