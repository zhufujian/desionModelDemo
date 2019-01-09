package com.study.demo.relationModel;

import com.study.demo.relationModel.command.Command;
import com.study.demo.relationModel.command.Invoker;
import com.study.demo.relationModel.command.MyCommand;
import com.study.demo.relationModel.command.Receiver;

public class CommandTest {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command cmd = new MyCommand(receiver);
		Invoker invoker = new Invoker(cmd);
		invoker.action();
	}
}
