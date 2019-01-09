package com.study.demo.relationModel.command;

/**
 * 
*
* @Description: 命令
* @ClassName: MyCommand 
* @author zhufj
* @date 2019年1月9日 下午4:10:43 
*
 */
public class MyCommand implements Command {

	private Receiver receiver;

	
	public MyCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}


	@Override
	public void exe() {
		receiver.action();
	}

}
