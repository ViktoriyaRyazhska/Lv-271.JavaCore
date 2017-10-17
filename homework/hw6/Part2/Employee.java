package homework.hw6.Part2;

public class Employee implements Calculation {
	private int employeeid;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public Employee() {
	}

	public Employee(int employeeid, String name) {
		this.employeeid = employeeid;
		this.name = name;
	}

	@Override
	public int CalculatePay() {
		return 0;
	}

	public void SalarySorting(Employee[] emp) {
		Employee temp = new Employee();
		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].CalculatePay() < emp[j].CalculatePay()) {
					temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}
		}
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}
	}

}
