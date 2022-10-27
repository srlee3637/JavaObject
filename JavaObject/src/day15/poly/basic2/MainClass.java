package day15.poly.basic2;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

		
		//다형성을 적용한 배열
		Student s = new Student("홍길동", 20, "123123");
		
		Teacher t = new Teacher("홍길자", 30, "프로그램");
		
		Employee e = new Employee("홍길순", 40, "취업지원팀");
		
		//Object[] arr = {s, t, e};
		//이렇게 쓰면 오버라이딩된 메서드를 사용하지 못하기 때문에 아래처럼 해준다.
		Person[] arr = {s, t, e};
		
		for(Person p : arr) {
			System.out.println(p.info()); //오버라이딩된 메서드 호출 
		}
		printInfo(s);
		printInfo(t);
		printInfo(e);
		
		
		House h = new House();
		h.setPerson(s);
		h.setPerson(t);
		h.setPerson(e);
		
		Person[] ar = h.getArr();
		System.out.println(Arrays.toString(ar));
		for(Person p : ar) {
			if(p==null)break;
			System.out.println(p.info());
		}
		
	}

	//스튜던트 or 티쳐 or 임플로이로 받아야함
	public static void printInfo(Person p) {//부모타입 매개변수
		System.out.println(p.info());
	}
}
