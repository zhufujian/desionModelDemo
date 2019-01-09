package com.study.demo.relationModel.command;

/**
 * 
*
* @Description: 被调用者（士兵)
* @ClassName: Receiver 
* @author zhufj
* @date 2019年1月9日 下午4:09:44 
*
 */
public class Receiver {

	public void action(){
		System.out.println("command received!");
	}
}
