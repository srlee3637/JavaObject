package day13.override2;

public class Student extends Person {
	
	String studentId; //학번
	
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
	}
}
