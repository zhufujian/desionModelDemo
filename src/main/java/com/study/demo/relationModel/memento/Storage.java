package com.study.demo.relationModel.memento;

/**
 * 
*
* @Description: 存储备忘录的类
* @ClassName: Storage 
* @author zhufj
* @date 2019年1月9日 下午4:30:32 
*
 */
public class Storage {

	private Memento memento;

	public Storage(Memento memento) {
		super();
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
