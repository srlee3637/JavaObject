package day17.inter.basic3;

public class GoldFish extends Fish implements IPet {

	@Override
	public void swim() {
		System.out.println("금붕어는 강에서 논다");
	}

	@Override
	public void play() {
		System.out.println("금붕어는 어항에서 논다");
	}

}
