package com.study.demo.designModel.objectAdapter;

import com.study.demo.designModel.classAdapter.Source;
import com.study.demo.designModel.classAdapter.Targetable;

public class Wrapper implements Targetable {
	 
	private Source source;
	
	public Wrapper(Source source){
		super();
		this.source = source;
	}
	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}
 
	@Override
	public void method1() {
		source.method1();
	}
}
