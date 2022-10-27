package day13.this_;

public class MainClass {

	public static void main(String[] args) {

		Person p = new Person();//부모님
		System.out.println(p.info());
		
		Person p2 = new Person("honggildong", 20);
		System.out.println(p2.info());
		
		Person p3 = new Person("honggilnam");
		System.out.println(p3.info());
	
	
	}

}
