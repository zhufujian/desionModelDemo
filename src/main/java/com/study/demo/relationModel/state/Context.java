package com.study.demo.relationModel.state;

/**
 * 
*
* @Description: 状态模式的切换类
* @ClassName: Context 
* @author zhufj
* @date 2019年1月9日 下午4:39:01 
*
 */
public class Context {
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Context(State state) {
		super();
		this.state = state;
	}

	public void method() {
		if (state.getValue().equals("state1")) {
			state.method1();
		} else if (state.getValue().equals("state2")) {
			state.method2();
		}
	}
}
