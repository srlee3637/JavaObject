package day14.modi.protec.pac1;

public class A {

	/*
	 * protected는 기본적으로 같은 패키지에서만 사용할 수 있다.(default와 동일)
	 * 단, 패키지가 다르더라도 상속관계에서 super를 통한 접근은 가능
	 */
	
	protected String s;
	
	protected A() {
		
	}
	
	protected void method() {
		
	}
}
