package day15.poly.basic2;

public class Employee extends Person {

	String department; //부서


//	Employee(){
//
//	}

	Employee(String name, int age, String department){
		super(name, age);
		//위와 아래는 같은 구문이다.
//		super(); 
//		this.name = name;
//		this.age = age;
		this.department = department;
	}
	
	//오버라이딩
//	String info() {
//		return "이름:" + name + ", 나이:" + age + ", 부서:" + department;
//	}
	String info() { 
		//super.메서드() - 오버라이딩된 메서드에서 부모님의 원형 메서드가 필요할 때 사용가능
		return super.info() + ", 부서:" + department;
	}
}
