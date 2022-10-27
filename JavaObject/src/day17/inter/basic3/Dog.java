package day17.inter.basic3;

public class Dog extends Animal implements IPet {

	@Override
	public void eat() {
		System.out.println("강아지는 사료를 먹는다");
	}

	@Override
	public void play() {
		System.out.println("강아지는 방에서 논다");
	}

}
