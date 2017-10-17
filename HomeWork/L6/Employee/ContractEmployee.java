package HomeWork.L6.Employee;

public class ContractEmployee extends Employee implements Pay {
	private String name;
	private int fixedMounPay = 0;
	private int salary = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFixedMounPay() {
		return fixedMounPay;
	}

	public void setFixedMounPay(int fixedMounPay) {
		this.fixedMounPay = fixedMounPay;
	}

	public ContractEmployee(String name, int fixedMounPay) {
		super();
		this.name = name;
		this.fixedMounPay = fixedMounPay;
	}

	@Override
	public int calculatePay() {

		return salary = fixedMounPay;
	}

	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "ContractEmployee " + name + ", has salary " + salary + ".";
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
