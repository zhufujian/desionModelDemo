package com.study.demo.relationModel;

import com.study.demo.relationModel.visitor.MySubject;
import com.study.demo.relationModel.visitor.MyVisitor;
import com.study.demo.relationModel.visitor.Subject;
import com.study.demo.relationModel.visitor.Visitor;

public class VisitorTest {

	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();
		Subject sub = new MySubject();
		sub.accept(visitor);	
	}
}
