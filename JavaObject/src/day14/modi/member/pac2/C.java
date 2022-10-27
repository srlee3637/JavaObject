package day14.modi.member.pac2;

import day14.modi.member.pac1.A;

public class C {
	//A의 기능
	public C() {
		A a = new A();
		a.var1 = 10;
		//a.var2 = 20; // no - default
		//a.var3 =3; // no - private
		
		a.method01();
		//a.method02(); // no - default
		//a.method03(); //no - private
	}

}
