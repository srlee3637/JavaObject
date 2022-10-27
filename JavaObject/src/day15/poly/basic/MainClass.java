package day15.poly.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01(); // 상속
		c.method02(); // 오버라이딩
		c.method03(); // 내꺼
		
		
		System.out.println("-----다형성-----");
		//자식이 부모에 저장되는데, 부모님처럼 사용되지만 
		//단, 자식의 오버라이딩된 메서드가 실행된다
		Parent p = c; // Parent p = new Child();
		p.method01();
		p.method02();
		//p.method03();
		System.out.println(p == c); //동일한 주소값을 나타냄
		
		System.out.println("-----클래스 캐스팅-----");
		//다형성이 적용되면, 자식이 가지고 있던 본래의 기능을 사용할 수 없기 때문에, 
		//클래스 캐스팅을 사용한다. 
		
		Child cc = (Child)p;
		cc.method01();
		cc.method02();
		cc.method03();
		
		System.out.println("-----주의할 점-----");
		//다형성이 적용된 객체만 캐스팅이 가능합니다.
		//Parent pp = new Parent();
		//Child ccc = (Child)pp;// error
		
	}

}
