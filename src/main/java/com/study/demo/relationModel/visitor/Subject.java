package com.study.demo.relationModel.visitor;

public interface Subject {

	public void accept(Visitor visitor);
	public String getSubject();
}
