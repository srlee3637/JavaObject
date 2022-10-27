package day18.exception.trycatch;

public class TryCatchEx01 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		System.out.println(a + b);
		
		
		try {
			System.out.println(a / b);
			
			System.out.println("이 문장은 실행 될까요?");
			
		//catch뒤에는 해당 예외를 처리할 수 있는 예외 종류가 들어갑니다.
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다");
		}

		
		
		System.out.println(a - b);
		

		
		
		
		
	}
}
