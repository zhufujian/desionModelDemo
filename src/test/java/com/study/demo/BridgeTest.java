package com.study.demo;

import com.study.demo.designModel.bridge.Bridge;
import com.study.demo.designModel.bridge.MyBridge;
import com.study.demo.designModel.bridge.SourceSub1;
import com.study.demo.designModel.bridge.SourceSub2;
import com.study.demo.designModel.bridge.Sourceable;

public class BridgeTest {

	public static void main(String[] args) {
		
		Bridge bridge= new MyBridge();
		//调用第一个对象
		Sourceable sourceable1 =new SourceSub1();
		bridge.setSourceable(sourceable1);
		bridge.method();
		//调用第二个对象
		Sourceable sourceable2=new SourceSub2();
		bridge.setSourceable(sourceable2);
		bridge.method();
	}
}
