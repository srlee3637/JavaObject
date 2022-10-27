package day13.this_;

public class Student extends Person {
	
	String studentId; //학번
	
	Student(){
		
	}
	
	Student(String name, int age, String studentId){
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	//오버라이딩
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
	}
}
