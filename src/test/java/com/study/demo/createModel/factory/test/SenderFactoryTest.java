package com.study.demo.createModel.factory.test;

import com.study.demo.createModel.factory.SenderFactory;
import com.study.demo.createModel.factory.SenderFactory02;
import com.study.demo.createModel.factory.SenderFactory03;

/**
 * 
*
* @Description: 
* 工厂模式适合:凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建
* 第一种如果传入的字符串有误，不能正确创建对象，
* 第三种相对于第二种，不需要实例化工厂类，
* 所以，大多数情况下，我们会选用第三种——静态工厂方法模式
* @ClassName: SenderFactoryTest 
* @author zhufj
* @date 2019年1月7日 下午2:12:18 
*
 */
public class SenderFactoryTest {

	public static void main(String[] args) {
		factory01();
		System.out.println("======================");
		factory02();
		System.out.println("======================");
		factory03();
	}
	
	private static void factory01(){
		SenderFactory senderFactory=new SenderFactory();
		senderFactory.produce("sms").send();
		senderFactory.produce("mail").send();
	}
	private static void factory02(){
		SenderFactory02 senderFactory=new SenderFactory02();
		senderFactory.produceMail().send();
		senderFactory.produceSms().send();
	}
	private static void factory03(){
		SenderFactory03.produceMail().send();
		SenderFactory03.produceSms().send();
	}
}
