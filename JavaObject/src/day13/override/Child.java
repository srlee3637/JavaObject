package day13.override;

public class Child extends Parent {

	int method02() {
		System.out.println("자식의 오버라이딩 된 2번 메서드");
		return 100;
	}
	//자신의 메서드
	void method03() {
		System.out.println("자식의 3번 메서드");
	}
}
