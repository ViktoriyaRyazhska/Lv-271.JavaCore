package l3;

public class Employee {
	private static double totalSalary = 0;

	
	
	private String name;
	private int rait = 0;
	private int hours = 0;
	private double bonus = 0;
	
	
	
	public Employee() {
		totalSalary = totalSalary + salary();
		}
		
	public Employee(String name, int rait) {
		this.name = name;
		this.rait = rait;
		totalSalary = totalSalary + salary();
	}
	
	public Employee(String name, int rait, int hours) {
		this.name = name;
		this.rait = rait;
		this.hours = hours;
		totalSalary = totalSalary + salary();
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRait() {
		return rait;
	}
	public void setRait(int rait) {
		totalSalary = totalSalary - salary();
		this.rait = rait;
		totalSalary = totalSalary + salary();
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		totalSalary = totalSalary - salary();
		this.hours = hours;
		totalSalary = totalSalary + salary();
	}
	
	public void changeRate(int rait){
		totalSalary = totalSalary - salary();
		this.rait=rait;
		totalSalary = totalSalary + salary();
	}
	
	public double salary(){
		return (this.hours*this.rait);
	}


	public static double getTotalSalary(){
		return (totalSalary);
	}
	
	public void bonus(){
		totalSalary = totalSalary - salary();
		this.bonus = salary() * 0.1;
		totalSalary = totalSalary + salary()*1.1;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary() + "+" + bonus + "]";
	}



	
	
	
	

	


	
	
}
