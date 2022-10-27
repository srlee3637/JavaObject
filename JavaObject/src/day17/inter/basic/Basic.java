package day17.inter.basic;
//인터페이스는 implements키워드로 상속을 받습니다
public class Basic /*extends Object*/implements Inter1,Inter2 {

	@Override
	public void method1() {
		System.out.println("오버라이딩 된 inter1메서드");
	}
	
	@Override
	public void method2() {
		System.out.println("오버라이딩 된 inter2메서드");
	}

}
