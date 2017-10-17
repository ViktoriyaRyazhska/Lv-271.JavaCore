package homework.hw6.Part2;

public class Main {
	public static void main(String[] args) {
		Employee[] workers = new Employee[10];
		workers[0] = new SalariedEmployee(1, "Ruslan", 160, 35);
		workers[1] = new SalariedEmployee(2, "Oleg", 210, 30);
		workers[2] = new SalariedEmployee(3, "Maksym", 170, 40);
		workers[3] = new SalariedEmployee(4, "Rostyk", 200, 25);
		workers[4] = new SalariedEmployee(5, "Roman", 215, 36);
		workers[5] = new ContractEmployee(6, "Vlad", 4500);
		workers[6] = new ContractEmployee(7, "Alex", 7400);
		workers[7] = new ContractEmployee(8, "Nazar", 7200);
		workers[8] = new ContractEmployee(9, "Petro", 6500);
		workers[9] = new ContractEmployee(10, "Yura", 6900);
		Employee emp = new Employee();
		emp.SalarySorting(workers);

	}
}
