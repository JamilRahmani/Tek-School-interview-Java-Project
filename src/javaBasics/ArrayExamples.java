package javaBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayExamples {
	public static void main(String[] args) {

		
		Vector v = new Vector<>();
		v.add(123);
		v.add(123);
		
		
		System.out.println(v.capacity());
		
		String[] data = new String[5];

//		data[0] = 5;
//		data[1] = 10;
//		data[2] = 15;
//		data[3] = 20;
//		data[4] = 25;

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

		for (String i : data) {
			System.out.println(i);
		}

		// default, values
		// int, 0
		// double, 0.0
		// boolean, false
		// Object, null

		String[] names = { "Jack", "David" };

		int[][] numbers = new int[5][3];

//		int[][] nums = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

		numbers[0][0] = 1;
		
		int x = 1;
		
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = x++;
				System.out.print(numbers[i][j] + "\t");
			}
			
			System.out.println();
			
		}
		
		
		
	}
}
