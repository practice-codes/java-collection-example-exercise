package com.java.java_collection_example_exercise;

import java.util.ArrayList;

public class ArrayListExcercise {
	public static void main(String[] args) { // main shortcut

		ArrayList<String> arr = new ArrayList<String>();

		System.out.println("India Cricket Team Player");

		arr.add("Shikhar");
		arr.add("Rohit");
		arr.add("Kohli");
		arr.add("Dhoni");
		arr.add("Rahane");
		arr.add("Pandaya");
		arr.add("Bhuvi");
		arr.add("Bumrah");
		arr.add("Kuldeep");
		arr.add("Chahal");
		arr.add("Iyar");
		
		System.out.println("All Player List: " + arr);

		arr.add(10, "Yadav");
		System.out.println("All Player List After Yadav Add: " + arr);

		arr.remove(11);
		System.out.println("After Player 12 Remove :" + arr);

		arr.remove("Yadav");
		System.out.println("After Remove Yadav :" + arr);

		System.out.println(arr.get(3));

		arr.set(1, "Ishant");
		System.out.println("OutPut after set: " + arr);

		int val = arr.indexOf("Ishant");
		System.out.println("Output Value Indexof Ishant :" + val);

		int val1 = arr.indexOf("ISHANT");
		System.out.println("Output Value Indexof ISHANT :" + val1);

		int sizearr = arr.size();
		System.out.println("SIze Of Array: " + sizearr);

		// arr.contains("Rohit");
		System.out.println("Output Contains: " + arr.contains("Rohit"));

		arr.clear();
		System.out.println("Output AFter CLear: " + arr);

	}

}
