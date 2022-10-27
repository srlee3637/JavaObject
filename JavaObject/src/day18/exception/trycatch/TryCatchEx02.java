package day18.exception.trycatch;

public class TryCatchEx02 {

	public static void main(String[] args) {
		
		String[] arr = {"홍길동", "이순신", "홍길자"};
		
		int i = 0;
		while( i < 4) {
			
			try {
				System.out.println(arr[i]);
				
			} catch (Exception e) {
				System.out.println("범위를 벗어났습니다");
			}finally {
				System.out.println("이 문장은 예외 여부와 상관없이 항상 실행됨");
			}
			i++;
			
		}
		
		
		
		
		
		
	}
}
