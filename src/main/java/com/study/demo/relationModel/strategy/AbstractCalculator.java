package com.study.demo.relationModel.strategy;

/**
 * 
*
* @Description: 辅助类
* @ClassName: AbstractCalculator 
* @author zhufj
* @date 2019年1月9日 上午10:49:58 
*
 */
public abstract class AbstractCalculator {

	public int[] split(String exp,String opt){
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}

}
