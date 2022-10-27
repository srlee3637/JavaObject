package day17.inter.basic3;

public class PetHouse {
	//1. IPet타입을 받아서 기능을 출력하는 메서드
	public static void info(IPet i) {
		i.play();
	}
	//2. IPet[] 타입을 받아서 기능을 전부 출력하는 메서드 
	public static void infoAll(IPet[] i) {
		for(IPet i1 : i) {
			i1.play();
		}
	}
}
