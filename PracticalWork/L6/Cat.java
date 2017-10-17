package PracticalWork.L5.L6;

public class Cat implements Animal {

	@Override
	public void voice() {
		System.out.println("The Cat says meeo");
	}

	@Override
	public void feed() {
		System.out.println("You have to feed your Cat");
	}

}
