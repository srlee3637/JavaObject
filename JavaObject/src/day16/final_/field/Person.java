package day16.final_.field;

public class Person {
	/*
	 * final 변수는 값을 변경할 수 없기 때문에
	 * 직접 초기값을 지정 or 생성자를 통해서 초기화 
	 */
	public final String nation = "대한민국";
	public final String ssn;
	public String name;
	
	Person(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}
	
}
