package day14.super_;

public class Person  {//부모 클래스로 사용 
	//실제 이 class는 extend Object가 자동으로 되어있는 거다
	
	String name;
	int age;
	
//	Person(){
////		this.name = "홍순자".toUpperCase();
////		this.age = 1;
////		
////		System.out.println("100줄짜리 코드.....");
//		this("홍길동"); // 두개짜리 생성자 호출
//	}
	
	Person(String name){
		this(name,1); // 두개짜리 생성자 호출
	}
	
	
	Person(String name, int age){
		this.name = name.toUpperCase();
		this.age = age;
		
		System.out.println("100줄짜리 코드.....");
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}

}
