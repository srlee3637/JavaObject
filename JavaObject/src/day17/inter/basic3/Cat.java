package day17.inter.basic3;

public class Cat extends Animal implements IPet {

	@Override
	public void eat() {
		System.out.println("고양이는 생선을 먹는다");
	}

	@Override
	public void play() {
		System.out.println("고양이는 방에서 논다");
	}

}
