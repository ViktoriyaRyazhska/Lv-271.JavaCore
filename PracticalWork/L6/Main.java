package PracticalWork.L5.L6;

public class Main {

	public static void main(String[] args) {

		Animal[] animal = new Animal[4];
		animal[0] = new Cat();
		animal[1] = new Cat();
		animal[2] = new Dog();
		animal[3] = new Dog();

		for (int i = 0; i < animal.length; i++) {
			animal[i].voice();
			animal[i].feed();
		}
	}
}
