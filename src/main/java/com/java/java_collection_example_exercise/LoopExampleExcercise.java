package com.java.java_collection_example_exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class LoopExampleExcercise {
	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Rohit");
		arr.add("Shikhar");
		arr.add("Kohli");
		arr.add("Dhoni");
		arr.add("Rahane");
		System.out.println("Output Is:" + arr);

		System.out.println("------------------Foor Loop Example----------------");

		// for(int counter = 0; counter <=arr.size(); counter++)
		// {
		// System.out.println("Output Is: "+arr.get(counter));
		// }
		// Error Found

		System.out.println("-------------------ForEach Loop-------------------");

		// for(String listarr : arr)
		// {
		// System.out.println("Output List:"+listarr);
		// How can Create Index like 1,2,3,4,5
		// }

		System.out.println("---------While Loop-----------");
		int count = 0;
		while (arr.size() > count)

		{
			System.out.println("Output Is: " + arr.get(count));
			count++;
		}

		System.out.println("------------Iterator------------------");
		Iterator<String> iteList = arr.iterator();
		while (iteList.hasNext()) {
			System.out.println("Output Is:" + iteList.next());
		}

		System.out.println("----------------- Enumeration -------------------");

		Enumeration<String> e = Collections.enumeration(arr);

		System.out.println("Enumeration List :");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
