package day16.abs.bad;

public class MainClass {

	public static void main(String[] args) {

		SeoulStore s = new SeoulStore();
		s.apple();
		s.melon();
		s.orange();//오버라이딩을 반드시 해야하는데, 
		//하지 않았다면 잘못된 메서드가 실행될 수 있다.
	}

}
