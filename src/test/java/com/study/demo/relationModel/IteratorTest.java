package com.study.demo.relationModel;


import com.study.demo.relationModel.iterator.Collection;
import com.study.demo.relationModel.iterator.Iterator;
import com.study.demo.relationModel.iterator.MyCollection;

public class IteratorTest {

	public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}
}
