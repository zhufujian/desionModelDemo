package com.study.demo.designModel.facade;

public class Computer {

	private CPU cpu;
	private Memory memory;
	private Disk disk;
	public Computer() {
		super();
		cpu =new CPU();
		memory =new Memory();
		disk = new Disk();
	}

	public void startup(){
		System.out.println("start the computer");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("star computer finished!");
	}
	
	public void shutdown(){
		System.out.println("shutdown the computer");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("computer shutdown finished!");
	}
}
