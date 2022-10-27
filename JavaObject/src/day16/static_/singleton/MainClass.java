package day16.static_.singleton;

public class MainClass {
	public static void main(String[] args) {
		
		System.out.println(Computer.a);
		System.out.println(Computer.a);
		System.out.println(Computer.a);
		System.out.println(Computer.a);
		
		//Singleton s = new Singleton(); 2번으로 인해 막힘
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s == s2 && s2 == s3);
		s.site = "이순신";
		System.out.println(s2.site);
	}
}
