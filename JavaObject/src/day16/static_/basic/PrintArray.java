package day16.static_.basic;
/*
Arrays.toString() 의 기능을 따라하기


PrintArray클래스
1. toArray() - int[]을 매개변수로 입력받아 배열의 모형을 문자열로 리턴하는 메서드
2. toArray() - 1번과 내용은 같고, char[]을 받도록 overloading
2. toArray() - 1번과 내용은 같고, String[]을 받도록 overloading
*/
public class PrintArray {
	private PrintArray() {} // 객체생성 불가
//	PrintArray(){
//		
//	}
	
	static String toArray(int[] a) {
		String s = "[";
		for(int i = 0; i < a.length; i++) {
			
			if(i == a.length -1) {
				s += a[i] + "]";
				
				break;
			}
			s += a[i] + ", ";
		}
		
		return s;
	}
	
	static String toArray(char[] a) {
		String s = "[";
		for(int i = 0; i < a.length; i++) {
			
			if(i == a.length -1) {
				s += a[i] + "]";
				break;
			}
			s += a[i] + ", ";
		}
		
		return s;
	}
	
	static String toArray(String[] a) {
		String s = "[";
		for(int i = 0; i < a.length; i++) {
			
			if(i == a.length -1) {
				s += a[i] + "]";
				break;
			}
			s += a[i] + ", ";
		}
		
		return s;
	}

}
