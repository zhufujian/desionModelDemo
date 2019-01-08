package com.study.demo.createModel.builder;

import java.util.ArrayList;
import java.util.List;

import com.study.demo.createModel.abstractfactory.MailSender;
import com.study.demo.createModel.abstractfactory.Sender;
import com.study.demo.createModel.abstractfactory.SmsSender;

/**
 * 
*
* @Description: 
* 建造者模式:将各种产品集中起来进行管理，用来创建复合对象
* 复合对象：某个类具有不同的属性
* 与工厂模式的区别：工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部分
* @ClassName: Builder 
* @author zhufj
* @date 2019年1月7日 下午5:45:06 
*
 */
public class Builder {
	
	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		for(int i=0; i<count; i++){
			list.add(new MailSender());
		}
	}
	
	public void produceSmsSender(int count){
		for(int i=0; i<count; i++){
			list.add(new SmsSender());
		}
	}

	public List<Sender> getList() {
		return list;
	}

	public void setList(List<Sender> list) {
		this.list = list;
	}
}