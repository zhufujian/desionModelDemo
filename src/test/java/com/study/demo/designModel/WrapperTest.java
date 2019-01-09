package com.study.demo.designModel;

import com.study.demo.designModel.adapter.interfaceAdapter.SourceSub1;
import com.study.demo.designModel.adapter.interfaceAdapter.SourceSub2;
import com.study.demo.designModel.adapter.interfaceAdapter.Sourceable;

/**
 * 
*
* @Description: 接口的适配器模式
* @ClassName: WrapperTest 
* @author zhufj
* @date 2019年1月7日 下午6:12:52 
*
 */
public class WrapperTest {
	 
	public static void main(String[] args) {
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();
		
		source1.method1();
		source1.method2();
		System.out.println("================");
		source2.method1();
		source2.method2();
	}
}
