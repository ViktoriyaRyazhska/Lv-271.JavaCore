package PractiseTask.l6;

public class Student extends Person {

	public Student() {
	}

	private final String TYPE_NAME = "student";

	@Override
	public void print() {
		System.out.println("I'm a " + TYPE_NAME);
	}
}
