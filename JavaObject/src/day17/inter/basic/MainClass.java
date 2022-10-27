package day17.inter.basic;

public class MainClass {

	//추상 클래스와 인터페이스는 거의 비슷하지만 
	//더 interface에서 더 다양한 기능이 있음
	//인터페이스는 다중 상속을 지원한다. 
	//단 인터페이스에 있는 모든 추상메서드는 Basic에서 모두 오버라이딩이 되어야한다.
	public static void main(String[] args) {
		//인터페이스는 객체생성이 불가합니다.
		//Inter1 i1 = new Inter1();
		
		//인터페이스도 부모타입이 될 수 있다.
		//Inter1의 기능만 사용하고, override된 메서드
		//Inter1 b = new Basic();
		//b.method1();
		//b.method2();
		
		///////////////////////////
		Basic b = new Basic();
		b.method1();
		b.method2();
		////////////////////////////////
		Inter2 i2 = b;//inter2로 클래스 형 변환
		i2.method2();//method1은 사용할 수 없게된다.
		
		Basic bb = (Basic)b;//강제 클래스 형 변환 다운캐스팅
		
	}

}
