package com.study.demo.relationModel;

import com.study.demo.relationModel.memento.Original;
import com.study.demo.relationModel.memento.Storage;

public class MementoTest {

	public static void main(String[] args) {
		// 创建原始类
		Original origi = new Original("orig");
		// 创建备忘录
		Storage storage = new Storage(origi.createMemento());
		// 修改原始类的状态
		System.out.println("初始化状态为：" + origi.getValue());
		origi.setValue("new");
		System.out.println("修改后的状态为：" + origi.getValue());
		// 回复原始类的状态
		origi.restoreMemento(storage.getMemento());
		System.out.println("恢复后的状态为：" + origi.getValue());

	}

}
