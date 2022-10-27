package day16.poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {
		
		//instanceof - 객체의 모형을 확인
		Person s = new Student("홍길동", 10, "1234");
		Person t = new Teacher("이순신", 20, "프로그램");
		
		//Teacher s2 = (Teacher)s;
		//이렇게 되면 런타임에러가 뜬다
		//실제 아래처럼 해주어야 한다
		//Student s2 = (Student)s;
		//그래서 아래 처럼 확인을 할 수 있다
		
		casting(s);
		casting(t);
		
	}
	
	public static void casting(Person p) {
		
		if(p instanceof Student) { //p가 Student라면 true, 아니면 false
			Student s = (Student)p;
			System.out.println(s.info());
		}else if(p instanceof Teacher) {
			Teacher t = (Teacher)p;
			System.out.println(t.info());
			
		}
	}
}
