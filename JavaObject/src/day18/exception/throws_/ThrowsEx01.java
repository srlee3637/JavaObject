package day18.exception.throws_;

public class ThrowsEx01 {
	public static void main(String[] args) {

		//메서드에서 예외처리 - throws
		//throws 구문이 붙어 있는 메서드 or 생성자를 호출할 때는 예외를 대신 처리해야 합니다
		//즉 메서드 안에서 예외처리를 강요할 때 사용한다. 

		try {
			greeting(0);
			greeting(1);
			greeting(2);
			greeting(4);
			greeting(3);

		} catch (Exception e) {
			System.out.println("배열 참조를 벗어났습니다.");
		}


		System.out.println("----------------------------------------");

		try {
			calc(10);
			calc(-10);
			calc(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("\"0\" 으로 나눌 수 없습니다");		
		}
		
		System.out.println("----------------------------------------");

		try {
			greeting(5);
		} catch (Exception e) {
			//예외처리를 하면 예외의 내용을 알 수 가 없기 때문에, 
			//예외의 내용을 확인하기 위해 catch 영역에서는 항상 사용
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료");




	}

	//static
	private static String[] arr = {"안녕하세요" , "hello", "니하오", "고니찌와"};

	public static void greeting(int index) throws Exception {
		System.out.println(arr[index]);

	}

	public static void calc(int num) throws ArithmeticException {
		System.out.println(10/num);
	}
}
