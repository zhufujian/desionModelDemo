package com.study.demo.relationModel.visitor;

public class MySubject implements Subject{

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		return "hello";
	}

}
