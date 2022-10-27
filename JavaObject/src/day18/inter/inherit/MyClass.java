package day18.inter.inherit;

public class MyClass implements Inter3 {

	@Override
	public void some01() {
		System.out.println("inter1의 some1 오버라이드");
	}

	@Override
	public void some02() {
		System.out.println("inter1의 some2 오버라이드");
	}

	@Override
	public void some03() {
		System.out.println("inter2의 some3 오버라이드");
	}

	@Override
	public void some05() {
		System.out.println("inter3의 some5 오버라이드");
	}

}
