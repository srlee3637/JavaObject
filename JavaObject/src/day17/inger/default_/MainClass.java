package day17.inger.default_;

import java.util.List;
import java.util.stream.IntStream;

public class MainClass {

	public static void main(String[] args) {

		MyInter i = new MyClass();
		i.some1(); //오버라이딩된 메서드
		i.some2(); //default 메서드
		MyInter.some3(); // static 메서드
		System.out.println(MyInter.Pi);//상수
		
		

	}
}
