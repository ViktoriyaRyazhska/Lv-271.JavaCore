package HomeWork.L6.Employee;

public class Main {

	public static void main(String[] args) {
		Employee[] e = new Employee[5];
		e[0] = new SalariedEmployee("Naz", 123, 12);
		e[1] = new SalariedEmployee("Roma", 56, 5);
		e[2] = new ContractEmployee("Andr", 5000);
		e[3] = new ContractEmployee("Inna", 6000);
		e[4] = new ContractEmployee("Sara", 4000);
		for (Employee employee : e) {
			System.out.println(employee.calculatePay());
		}

		Employee x = new Employee() {

			@Override
			public int calculatePay() {
				return 0;
			}
		};

		for (int i = 0; i < e.length - 1; i++) {
			for (int j = i + 1; j < e.length; j++) {
				if (e[i].calculatePay() < e[j].calculatePay()) {
					x = e[i];
					e[i] = e[j];
					e[j] = x;
				}
			}
		}
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);

		}
	}
}
