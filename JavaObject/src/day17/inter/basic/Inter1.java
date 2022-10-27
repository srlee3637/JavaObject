package day17.inter.basic;

public interface Inter1 {
	//인터페이스는 객체생성이 불가합니다
	//상수, 추상메서드 +@ (default 메서드, static 메서드)
	//다만 주로 상수, 추상메서드 사용
	
	double PI = 3.14; //인터페이스에 변수를 선언 -> public static 상수로 선언됨
	void method1(); //인터페이스에 메소드를 선언 -> public 추상메서드가 됨
	
}
