package day13.override2;

public class Employee extends Person {
	
	String department; //부서
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 부서:" + department;
	}
}
