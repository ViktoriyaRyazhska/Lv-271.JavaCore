package HomeWork.L6.Employee;

public class SalariedEmployee extends Employee {
	private String name;
	private int hRate = 0;
	private int hoursWorked = 0;
	private String socialSecurityNumber;
	private int salary = 0;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int gethRate() {
		return hRate;
	}

	public void sethRate(int hRate) {
		this.hRate = hRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public SalariedEmployee(String name, int hRate, int hoursWorked) {

		this.name = name;
		this.hRate = hRate;
		this.hoursWorked = hoursWorked;

	}
	
	@Override
	public String toString() {
		return "SalariedEmployee " + name + ", has salary " + salary + ".";
	}

	@Override
	public int calculatePay() {
		return salary = hRate * hoursWorked;

	}

}
// the average monthly salary = hourly rate * number of hours worked