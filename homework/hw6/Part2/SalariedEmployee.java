package homework.hw6.Part2;

public class SalariedEmployee extends Employee implements Calculation{
	private int hours;
	private int rate;
	private String socialSecurityNumber;
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
	public String getSocialSecurityNumber(){
		return this.socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String ssn){
		this.socialSecurityNumber = ssn;
	}
	public SalariedEmployee(){
	}
	public int CalculatePay(){
		return getRate()*getHours();
	}
	
	public SalariedEmployee(int id, String name,int hours, int rate) {
		super(id, name);
		this.hours = hours;
		this.rate = rate;
		
	}

	@Override
	public String toString() {
		return "Id" + getEmployeeid() + " Name: " + getName() + " Salary: " + CalculatePay();
	}
	
}
