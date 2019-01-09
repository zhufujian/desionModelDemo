package com.study.demo.designModel;

import com.study.demo.designModel.facade.Computer;

/**
 * 
*
* @Description: 
* 外观模式:为了解决类与类之家的依赖关系的,降低了类类之间的耦合
* @ClassName: FacadeTest 
* @author zhufj
* @date 2019年1月7日 下午7:50:56 
*
 */
public class FacadeTest {

	public static void main(String[] args) {
		Computer computer= new Computer();
		computer.startup();
		computer.shutdown();
	}
}
