package day16.poly.instanceof_;

public class Person  {
	
	String name;
	int age;
	
	Person(String name){
		this(name,1);// 두개짜리 생성자 호출
	}
	
	Person(String name, int age){
		this.name = name.toUpperCase();
		this.age = age;
		
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}

}
