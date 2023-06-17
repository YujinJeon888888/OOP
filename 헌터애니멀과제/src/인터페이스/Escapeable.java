package 인터페이스;

import Animal.동물;

public interface Escapeable {
	public default void escape(동물 animal) {
		System.out.println(animal.이름+"이 탈출합니다. 어머나 동물이 탈출을 합니다..");
	}
	
}
