package day16.poly.instanceof_;

public class Teacher extends Person {
	
	String subject; //과목
	

	Teacher(String name, int age, String subject){
		super(name, age);
		this.subject = subject;
	}
	
	String info() {
		return super.info() + ", 과목:" + subject;
	}
}
		