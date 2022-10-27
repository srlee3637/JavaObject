package day14.modi.protec.pac1;

public class B {

	public B() {
		A a = new A(); 
		a.s = "홍길동"; //동일 패키지 접근가능
		a.method();
	}
}
