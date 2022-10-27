package day15.encap.obj;

public class Hotel {//사용자 클래스

	public String str;
	private Chef chef; // = new Chef();
	
	//기본 생성자 
	public Hotel() {
	}
	
	//생성자 - 클래스를 받는 생성자
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	//getter, setter
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() {
		return chef;
	}
	
	
}
