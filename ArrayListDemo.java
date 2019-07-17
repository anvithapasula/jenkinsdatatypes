package com.anvitha.collections.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public ArrayListDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list1 = new ArrayList();
		list1.add("anu");
		list1.add(1);
		list1.add(0.33);
		list1.add("anu");

		Iterator itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
