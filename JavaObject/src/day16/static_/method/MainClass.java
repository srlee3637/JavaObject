package day16.static_.method;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		Count c = new Count();
		c.some1();//일반메서드
		c.some2();//정적 메서드
		
		//정적메서드 - 객체생성 없이 사용
		Count.some2();
		//현재 b는? 3 - 메서드가 3번 호출됨
		System.out.println(Count.b);

		//main은 static이기 때문에
		MainClass m = new MainClass();
		m.a();
		b(); // MainClass.b(); 와 같다
		
		Math.random();
		Integer.parseInt("3");
		Arrays.toString(new int[3]);
		//전부 스테틱 메서드들이기 때문에 객체 생성 없이 바로 사용가능 
	}
	
	public void a() {
		
	}
	public static void b() {
		
	}

}
