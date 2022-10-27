package day14.modi.member.pac1;

public class A {
	//멤버변수
	public int var1;
	int var2;
	private int var3;
	
	//메서드
	public void method01() {}
	void method02() {}
	private void method03() {}
	
	//생성자
	public A() {
		this.var1 =1;
		this.var2 =2;
		this.var3 =3; //private
		
		this.method01();
		this.method02();
		this.method03();
	}
}
