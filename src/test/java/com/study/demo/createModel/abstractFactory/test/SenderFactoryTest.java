package com.study.demo.createModel.abstractFactory.test;

import com.study.demo.createModel.abstractfactory.Provider;
import com.study.demo.createModel.abstractfactory.SendMailFactory;
import com.study.demo.createModel.abstractfactory.SendSmsFactory;

/**
 * 
*
* @Description: 
* 工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，
* 所以，从设计角度考虑，有一定的问题，
* 用到抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码
* @ClassName: SenderFactoryTest 
* @author zhufj
* @date 2019年1月7日 下午2:27:49 
*
 */
public class SenderFactoryTest {

	public static void main(String[] args) {
		Provider smsFactoryProvider =new SendSmsFactory();
		smsFactoryProvider.produce().send();
		Provider mailFactoryProvider=new SendMailFactory();
		mailFactoryProvider.produce().send();
	}
}
