package com.study.demo.relationModel;

import com.study.demo.relationModel.strategy.ICalculator;
import com.study.demo.relationModel.strategy.Plus;

/**
 * 
*
* @Description: 策略模式（strategy）
* @ClassName: StrategyTest 
* @author zhufj
* @date 2019年1月9日 上午10:53:33 
*
 */
public class StrategyTest {

	public static void main(String[] args) {
	
		String exp="2+8";
		ICalculator calculator=new Plus();
		int result= calculator.calculate(exp); 
		System.out.println(result);
		
	}
}
