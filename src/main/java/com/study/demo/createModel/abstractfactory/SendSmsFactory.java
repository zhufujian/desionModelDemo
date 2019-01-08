package com.study.demo.createModel.abstractfactory;


/**
 * 
*
* @Description: 简单工厂类 
* @ClassName: SenderFactory 
* @author zhufj
* @date 2019年1月7日 下午1:57:47 
*
 */
public class SendSmsFactory implements Provider{

	@Override
	public Sender produce() {
		return new SmsSender();
	}
	
}
