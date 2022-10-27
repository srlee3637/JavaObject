package day13.overload;

public class MainClass {

	public static void main(String[] args) {

		Basic ba = new Basic();
		//이렇게 같은 함수 및 생성자를 
		//여러 개 사용 할 수 있는 것이 오버로딩
		ba.input(1);
		ba.input("홍길동");
		ba.input("홍길로", 2);
		ba.input(10, "홍길자");
		ba.input(100, 100, 1); // 정수형이 실수형 보다 작기 때문에 들어갈 수 있다.
		
		//인트배열, 실수배열, 문자열배열
		
	}

}
