package day13.this_;

public class Employee extends Person {

	String department; //부서


	Employee(){

	}

	Employee(String name, int age, String department){
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	//오버라이딩
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 부서:" + department;
	}
}
