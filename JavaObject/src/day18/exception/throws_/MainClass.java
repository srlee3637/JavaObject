package day18.exception.throws_;

public class MainClass {

	public static void main(String[] args) {
		
		
		try {
			ThrowsEx02 ex = new ThrowsEx02();
			
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		
	}

}
