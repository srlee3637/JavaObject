package day16.static_.var;

public class MainClass {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		System.out.println("일반변수: " + c1.a);
		System.out.println("정적변수: " + c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		System.out.println("일반변수: " + c2.a);
		System.out.println("정적변수: " + c2.b);
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		System.out.println("일반변수: " + c3.a);
		System.out.println("정적변수: " + c3.b);
		
		//지금 c1.b는 몇일까 - 3
		//지금 c2.b는 몇일까 - 3
		
		//static은 객체 생성없이 바로 접근 가능하다.
		Count.b++;
		System.out.println(Count.b);
	}

}
