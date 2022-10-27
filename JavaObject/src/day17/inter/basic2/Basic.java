package day17.inter.basic2;

public class Basic implements BasicInter{
	// 클래스가 가져야할 메서드를 interface에 정의

	@Override
	public void insert(int a) {
		System.out.println("insert....");
	}

	@Override
	public void info() {
		System.out.println("info....");
		
	}

	@Override
	public String getInfo() {
		System.out.println("getInfo....");
		return "getInfo";
	}

	@Override
	public int delete(int a) {
		System.out.println("delete....");
		return 0;
	}

	
	
}
