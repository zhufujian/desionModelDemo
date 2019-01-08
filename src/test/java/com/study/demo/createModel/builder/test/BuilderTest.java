package com.study.demo.createModel.builder.test;

import com.study.demo.createModel.builder.Builder;

public class BuilderTest {

	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
		builder.produceSmsSender(10);
		System.out.println(builder.getList().size());
	}
}
