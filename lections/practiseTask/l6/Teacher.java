package PractiseTask.l6;

public class Teacher extends Staff {
	private int salary;
	private final String TYPE_NAME = "teacher";

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Teacher() {
	}

	public Teacher(int salary) {
		super();
		this.salary = salary;

	}

	@Override
	public void salary() {
		System.out.println(TYPE_NAME + "'s salary is " + salary);
	}

	@Override
	public void print() {
		System.out.println("I'm a " + TYPE_NAME);
	}
}
