package day17.inger.default_;

public interface MyInter {
	//상수, 추상, default, static
	
	double Pi = 3.14;
	void some1();//이것만 오버라이딩 필요
	
	//default메서드 - 인터페이스에도 몸체를 가지는 메서드 선언이 가능
	//static 메서드 둘다 오버라이딩 필요 없다
	default void some2() {
		System.out.println("default메서드 실행");
	}
	
	static void some3() { //클래스 이름으로 접근 가능
		System.out.println("static메서드 실행");
	}
}
