package com.study.demo.relationModel;

import com.study.demo.relationModel.interpreter.Context;
import com.study.demo.relationModel.interpreter.Minus;
import com.study.demo.relationModel.interpreter.Plus;

public class InterpreterTest {

	public static void main(String[] args) {
		// 计算9+1-3的值
		Context context1=new Context(9, 1);
		int num1=new Plus().interpret(context1);
		Context context2=new Context(num1, 3);
		int result = new Minus().interpret(context2);
		System.out.println(result);

	}
}
