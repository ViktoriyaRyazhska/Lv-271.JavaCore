package lesson6;

public class Student extends Person {
	
	public Student(String name) {
		super(name);
	}

	@Override
	public void print() {
		System.out.println("I am a student, my name " + getName());
	}
	
	
	
}
