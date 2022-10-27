package day16.abs.good;

public abstract class Store {
	/*
	 * 1.메서드에 abstract를 붙이면 추상메서드가 된다({}가 없는 메서드)
	 * 2.추상메서드를 사용하고 싶다면, 추상클래스가 되어야 한다.
	 */

	public abstract void apple();
	public abstract void melon();
	public abstract void orange();
	
	//멤버변수, 생성자, 일반메서드 전부 사용 가능
	private String name = "호식이네";
	
	//생성자 사용 가능
	public Store() {
		System.out.println("추상클래스 생성자 호출");
	}
	
	//일반메서드 사용 가능
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
