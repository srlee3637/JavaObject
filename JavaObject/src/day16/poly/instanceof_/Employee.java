package day16.poly.instanceof_;

public class Employee extends Person {

	String department; //부서

	Employee(String name, int age, String department){
		super(name, age);		
		this.department = department;
	}
	
	String info() { 
		return super.info() + ", 부서:" + department;
	}
}
