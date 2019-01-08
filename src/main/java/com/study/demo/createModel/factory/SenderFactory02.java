package com.study.demo.createModel.factory;

/**
 * 
*
* @Description: 简单工厂类
* @ClassName: SenderFactory 
* @author zhufj
* @date 2019年1月7日 下午1:57:47 
*
 */
public class SenderFactory02 {

	public Sender produceMail() {
		return new MailSender();
	}
	public Sender produceSms(){
		return new SmsSender();
	}
}
