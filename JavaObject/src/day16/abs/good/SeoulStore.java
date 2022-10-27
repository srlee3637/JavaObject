package day16.abs.good;

//1.자식 클래스도 abstract이 되거나 
//2.추상메서드들을 override해주어야함 
public class SeoulStore extends Store {
	
	@Override
	public void apple() {

		System.out.println("서울지점 사과는 500원");
	}

	@Override
	public void melon() {

		System.out.println("서울지점 멜론은 600원");
	}
	
	@Override
	public void orange() {

		System.out.println("서울지점 오렌지는 700원");
	}

}
