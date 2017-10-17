package PracticalWork.L5.L6;

public class Dog implements Animal {

	@Override
	public void voice() {
		System.out.println("The Dog says woof");

	}

	@Override
	public void feed() {

		System.out.println("The Dog need food");
	}

}
