package PractiseTask.l5;

public class Employee {
	
	private String name;
	private int departmnet;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmnet() {
		return departmnet;
	}
	public void setDepartmnet(int departmnet) {
		this.departmnet = departmnet;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, int departmnet, double salary) {
		this.name = name;
		this.departmnet = departmnet;
		this.salary = salary;
	}
	public Employee(){
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", departmnet=" + departmnet + ", salary=" + salary + "]";
	}
	
}
