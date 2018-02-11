package com.java.java_collection_example_exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayInitializationExcercise {
	public static void main(String[] args) {

		// FIrst Example
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("Rohit", "Akash", "Ganesh", "Prakesh"));
		System.out.println("Output  Is: " + arr);

		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		System.out.println("Output Is" + arr1);

		// Second Example
		ArrayList<String> cities = new ArrayList<String>() 
		{{
				add("Delhi");
				add("Mumbai");
				add("Kolkata");
		}};
		System.out.println("Output Is:" + cities);

		// Third Example
		ArrayList<String> obj = new ArrayList<String>();

		obj.add("Gunajit");
		obj.add("Rabindra");
		obj.add("Kakul");
		System.out.println("Output Is :" + obj);

	}

}
