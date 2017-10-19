package lesson6;

public class Cleaner extends Staff {

	public Cleaner(String name, int salary) {
		super(name, salary);
	}

	@Override
	void print() {
		System.out.println("I am a cleaner, my name " + getName());
		
	}
	
	@Override
	void Salary() {
		System.out.println("My salary - " + getsalary());
		
	}

}
