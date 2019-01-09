package com.study.demo.relationModel.command;

/**
 * 
*
* @Description: 调用者（司令员）
* @ClassName: Invoker 
* @author zhufj
* @date 2019年1月9日 下午4:13:21 
*
 */
public class Invoker {

	private Command command;

	public Invoker(Command command) {
		super();
		this.command = command;
	}
	public void action(){
		command.exe();
	}

}
