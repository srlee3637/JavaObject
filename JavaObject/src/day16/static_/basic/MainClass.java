package day16.static_.basic;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

		//PrintArray p = new PrintArray();
		int[] a = {1,2,3,4,5};
		char[] c = {'a', 'b', 'c'};
		String[] str = {"A","B","C"};
		System.out.println(PrintArray.toArray(a));
		System.out.println(PrintArray.toArray(c));
		System.out.println(PrintArray.toArray(str));
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(str));
		
	}

}
