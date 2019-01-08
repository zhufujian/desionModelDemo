package com.study.demo.designModel.composite;

public class Tree {

	TreeNode root=null;

	public Tree(String name) {
		super();
		this.root = new TreeNode(name);
	}
	
	public static void main(String[] args) {
		Tree tree=new Tree("A");
		TreeNode noteB =new TreeNode("B");
		TreeNode noteC =new TreeNode("C");
		noteB.add(noteC);
		tree.root.add(noteB);
		System.out.println("build finished!");
	}
}
