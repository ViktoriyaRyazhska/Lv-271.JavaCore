package lesson5;

public class Employee {
	private String name;
	private int number;
	private int salary;
	
	public Employee() {
	}
	public Employee(String name, int number, int salary) {
		this.name = name;
		this.number = number;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void output() {
		System.out.println("Neme: " + name + ". department number " + number + ". Salary: " + salary);
	}
}
