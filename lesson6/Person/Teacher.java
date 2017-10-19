package lesson6;

public class Teacher extends Staff{
	
	public Teacher(String name, int salary) {
		super(name, salary);
	}

	@Override
	void print() {
		System.out.println("I am a teacher, my name " + getName());
		
	}
	
	@Override
	void Salary() {
		System.out.println("My salary - " + getsalary());
	}


}
