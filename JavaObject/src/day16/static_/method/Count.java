package day16.static_.method;

public class Count {
	
	public int a;
	public static int b;
	
	//일반 메서드 - 일반변수, 정정변수 둘다 사용가능
	public int some1() {
		a = 10;    //ok
		return ++b;//ok
	}
	
	//정적 메서드 - 정적변수만 사용가능(단, 객체생성을 통해서는 사용이 가능)
	public static int some2() {
		//a = 10;	   //no
		Count c = new Count();
		c.a = 10;  //ok
		
		return ++b;//ok
	}

}
