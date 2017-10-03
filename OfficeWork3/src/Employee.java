
public class Employee {
	private String name;
	private int rate;
	private int hours;
	
	private static double totalSum = 0;
	
	public Employee() {};
	public Employee(String name, int rate) {
		super();
		this.name = name;
		this.rate = rate;
	}
	public Employee(String name, int rate, int hours) {
		super();
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum = totalSum + Salary(); 
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		if (this.rate != 0) {
			totalSum = totalSum - Salary();
		}
		this.hours = hours;
		if (this.rate != 0) {
			totalSum = totalSum + Salary();
		}
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	
	
	public void changeRate(int rate) {
		if (this.hours != 0) {
			totalSum = totalSum - Salary();
		}
		this.rate = rate;
		if (this.hours != 0) {
			totalSum = totalSum + Salary();
		}
	}
	public int Salary() {
		return this.rate * this.hours;
	}
	public void printSalary() {
		System.out.println("Salary of " + this.name + " = " + this.rate * this.hours);
	}
	public double Bonuses() {
		return 0.1 * this.rate * this.hours;
	}
	public void printBonuses() {
		System.out.println("Bonuses for " + this.name + " = " + 0.1*this.rate*this.hours);
	}
	
	public static void TotalSum() {
		System.out.println("Total salsary = " + totalSum);
	}
}
