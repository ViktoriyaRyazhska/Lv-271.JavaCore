package lesson6;

public abstract class Staff extends Person {
	public int salary;
	
	public Staff(String name, int salary) {
		super(name);
		this.salary=salary;
	}
		public int getsalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	abstract void Salary();
}
