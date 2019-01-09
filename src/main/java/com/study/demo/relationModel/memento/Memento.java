package com.study.demo.relationModel.memento;

/**
 * 
*
* @Description: 备忘录类
* @ClassName: Memento 
* @author zhufj
* @date 2019年1月9日 下午4:29:22 
*
 */
public class Memento {

	private String value;

	public Memento(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
