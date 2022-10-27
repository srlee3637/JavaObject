package day16.final_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Person hong = new Person("123123-123123","홍길동");
//		hong.nation = "아메라카"; //값의 변경 금지
//		hong.ssn = "333333-333333";
		
		Person park = new Person("222222-222222","박찬호");
		
		System.out.println("홍길동의 주민번호: " + hong.ssn);
		System.out.println("박찬호의 주민번호: " + park.ssn);
		
		/////////////////////////////////
		//상수의 사용
		System.out.println(Constant.EARTH_RADIUS);
		System.out.println(Constant.PI);
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
	
	}

}
