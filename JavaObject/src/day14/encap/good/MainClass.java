package day14.encap.good;

public class MainClass {

	public static void main(String[] args) {

		MyBirth me = new MyBirth();
		me.setYear(1995); //set
		int year = me.getYear(); //get
		System.out.println("년도:" + year);
		
		me.setMonth(12); //set
		int month = me.getMonth(); //get
		System.out.println("월:" + month);
		
		me.setDay(26); //set
		int day = me.getDay(); //get
		System.out.println("일:" + year);
		
		me.setSsn("951226-1******"); //set
		String ssn = me.getSsn(); //get
		System.out.println("주민번호:" + ssn);
		
		System.out.println();
		me.info();
	}

}
