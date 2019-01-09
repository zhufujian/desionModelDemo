package com.study.demo.relationModel;

import com.study.demo.relationModel.mediator.Mediator;
import com.study.demo.relationModel.mediator.MyMediator;

public class MediatorTest {

	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}
