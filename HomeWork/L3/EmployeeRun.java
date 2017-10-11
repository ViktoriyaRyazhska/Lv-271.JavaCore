
public class EmployeeRun {

	public static void main(String[] args) {
		Employee emp1 = new Employee ("Oleg", 5, 10);
		Employee emp2 = new Employee ("Serg", 2, 3);
		Employee emp3 = new Employee ("Zahar", 6, 15);
		
		
		System.out.println("Total salary of all people is " + (emp1.salary() + emp2.salary() + emp3.salary())+ ".");
	}

}
