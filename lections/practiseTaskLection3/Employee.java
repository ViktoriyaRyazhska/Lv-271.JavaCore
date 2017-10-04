package lections.practiseTaskLection3;

public class Employee {
	private static int totalSum = 0;
	private String name;
	private int rate;
	private int hours;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public Employee() {
	}
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}
	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	public int salary(Employee worker){
		int salary = rate*hours;
		totalSum += salary;
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	public void changeRate(int rate){
		this.rate = rate;
	}
	public double bonuses(Employee worker){
		double bonuses = salary(worker)/10.0;
		totalSum -= salary(worker);
		return bonuses;
	}
	public static int getTotalSum(){
		return totalSum;
	}
	
}
