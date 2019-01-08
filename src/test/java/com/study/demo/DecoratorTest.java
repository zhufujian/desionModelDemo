package com.study.demo;

import com.study.demo.designModel.decorator.Decorator;
import com.study.demo.designModel.decorator.Source;
import com.study.demo.designModel.decorator.Sourceable;

/**
 * 
*
* @Description: 装饰模式
* @ClassName: DecoratorTest 
* @author zhufj
* @date 2019年1月7日 下午6:40:35 
*
 */
public class DecoratorTest {

	public static void main(String[] args) {
		Sourceable sourceable=new Source();
		Sourceable obj= new Decorator(sourceable);
		obj.method();
	}

}
