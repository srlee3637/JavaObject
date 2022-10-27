package day18.inter.inherit;

public class MainClass {

	public static void main(String[] args) {
		//똑같음
		//MyClass me = new MyClass();
		//Inter3 me = new MyClass();

		//inter2의 기능만사용할 수 있다( 오버라이드 된 메서드 실행)
		Inter2 m2 = new MyClass();
		m2.some03();
		m2.some04();

		//inter1의 기능만사용할 수 있다( 오버라이드 된 메서드 실행)
		Inter1 m1 = new MyClass();
		m1.some01();
		m1.some02();
	}

}
