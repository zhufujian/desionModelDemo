package com.study.demo.relationModel;

import com.study.demo.relationModel.observer.MySubject;
import com.study.demo.relationModel.observer.Observer1;
import com.study.demo.relationModel.observer.Observer2;
import com.study.demo.relationModel.observer.Subject;

public class ObserverTest {

	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		
		sub.operation();
	}
}
