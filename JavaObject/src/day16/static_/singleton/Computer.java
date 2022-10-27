package day16.static_.singleton;

public class Computer {
	public static int a = 10;
	
	//정적초기화자 - 1회만 실행됨
	static {
		System.out.println("단 1번 실행 - 클래스명이 호출될 때");
	}
}
