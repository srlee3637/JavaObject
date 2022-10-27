package day16.abs.good;

public class MainClass {

	public static void main(String[] args) {
		//1.추상클래스는 객체생성이 안된다.
		// 반드시 자식으로 구체화 된다.
		// Store s = new Store();
		
		Store s = new BusanStore();//new SeoulStore();
		
		s.apple();
		s.melon();
		s.orange();
		System.out.println(s.getName()); //상속받은
		
		Store s1 = new SeoulStore();//new SeoulStore();
		
		s1.apple();
		s1.melon();
		s1.orange();
		System.out.println(s.getName()); //상속받은
	}

}
