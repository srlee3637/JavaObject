package day17.inter.basic3;

public class MainClass {
	public static void main(String[] args) {
		//Dog d = new Dog(); // eat, play
		//Animal d = new Dog(); // eat
		//IPet d = new Dog(); // play 
		
		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal hodol = new Tiger();
		
		//1. Animal 배열에 저장
		Animal[] arr = {baduk, nabi, hodol};

		for(Animal a : arr) {
			a.eat();
		}
		
		System.out.println();
		
		//2. 바둑이는 Animal이지만 생성된 클래스가 
		//인터페이스 상속을 받고 있다면 상호형변환이 된다. IPet으로 캐스팅 할 수 있다.
		IPet i1 = (IPet) arr[0];
		IPet i2 = (IPet) nabi;
		IPet i3 = new GoldFish();
		IPet[] arr2 = {i1, i2, i3};
		
		for(IPet i : arr2) {
			i.play();
		}
		System.out.println();
		System.out.println("다음은 새로운 클래스에서 IPet을 받아 출력하는 메서드");
		System.out.println();
		
		PetHouse.info(i3);
		PetHouse.infoAll(arr2);
	}
}
