package com.study.demo.designModel;

import com.study.demo.designModel.adapter.classAdapter.Adapter;
import com.study.demo.designModel.adapter.classAdapter.Source;
import com.study.demo.designModel.adapter.classAdapter.Targetable;
import com.study.demo.designModel.adapter.objectAdapter.Wrapper;

public class ClassAdapterTest {
	 
	public static void main(String[] args) {
		classAdapter();
		objAdapter();
	}
	
	/**
	 * 
	* @Title:
	* @Description:类的适配器模式
	 */
	private static void classAdapter(){
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}
	/**
	 * 
	* @Title:
	* @Description:对象的适配器模式
	 */
	private static void objAdapter(){
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();
	}
}
