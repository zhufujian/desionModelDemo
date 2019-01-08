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
public class SenderFactory {

	public Sender produce(String type) {

		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		}
		System.out.println("请求参数不支持");
		return null;
	}
}
