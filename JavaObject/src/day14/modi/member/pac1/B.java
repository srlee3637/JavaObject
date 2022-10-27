package day14.modi.member.pac1;

public class B {

	//A의 기능
	
	public B() {
		A a = new A();
		a.var1 = 10;
		a.var2 = 20;
		//a.var3 =3; // no - private
		
		a.method01();
		a.method02();
		//a.method03(); //no - private
	}
}
