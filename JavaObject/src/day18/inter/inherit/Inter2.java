package day18.inter.inherit;

public interface Inter2 {

	void some03();
	default void some04() {
		System.out.println("디폴트 메서드");
	}
}
