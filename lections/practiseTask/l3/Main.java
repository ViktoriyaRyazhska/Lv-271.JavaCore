package lections.practiseTaskLection3;

public class Main {

	public static void main(String[] args) {
		Employee worker1 = new Employee();
		Employee worker2 = new Employee("Volodya", 10);
		Employee worker3 = new Employee("Oleg", 8, 120);
		worker1.setName("Roman");
		worker1.setRate(6);
		worker1.setHours(200);
		worker2.setHours(120);
		worker3.changeRate(5);
		System.out.println("Our employees: ");
		System.out.println(worker1);
		System.out.println("salary is: " + worker1.salary(worker1));
		System.out.println("bonuses are: " + worker1.bonuses(worker1));
		System.out.println(worker2);
		System.out.println("salary is: " + worker2.salary(worker2));
		System.out.println("bonuses are: " + worker2.bonuses(worker2));
		System.out.println(worker3);
		System.out.println("salary is: " + worker3.salary(worker3));
		System.out.println("bonuses are: "+ worker3.bonuses(worker3));
		System.out.println();
		System.out.print("Total salary of all employees is: ");
		System.out.println(Employee.getTotalSum());
	}

}
