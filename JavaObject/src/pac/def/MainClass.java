package pac.def;

import pac.abc.Apple;//패키지 명을 포함한 클래스 명
import pac.abc.Banana;

import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {

		Melon m = new Melon();
		Apple a = new Apple();
		Banana b = new Banana();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(m); //주소 값
		System.out.println(new int[3]);
		
		String str1 = "hello";
		String str2 = "hello";
		String[] str3 = {"hello"};
		System.out.println(str1 == str3[0]);
	}

}
