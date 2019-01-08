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
public class SenderFactory03 {

	public static Sender produceMail() {
		return new MailSender();
	}
	public static Sender produceSms(){
		return new SmsSender();
	}
}
