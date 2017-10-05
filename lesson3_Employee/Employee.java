package lesson3;

public class Employee {
	private static int salary = 0;
	private static int totalsum = 0;
	private static double bonuses = 0;
	
	private String name;
	private int rate;
	private int hours;

	
	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}	
	
	public int salary() {
		salary = rate*hours;
		totalsum = totalsum + salary;
		return salary;
		
	}
	
	public double bonuses() {
		return (double)rate*hours*0.1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public void changeRate(int rate) {
		totalsum = totalsum - this.rate*hours;
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	public static int totalsum() {
		return totalsum;
	}
	
	
	
}
