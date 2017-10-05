package lesson3;

public class app {

	public static void main(String[] args) {
		Employee em1 = new Employee("Petrovich", 7);
		Employee em2 = new Employee("Ivanov", 9, 96);
		Employee em3 = new Employee("Shevchenko", 13, 89);
		System.out.println(em1);
		System.out.println(em2);
		System.out.println(em3);
		System.out.println("Salary Employee em1 = " + em1.salary());
		System.out.println("Salary Employee em2 = " + em2.salary());
		System.out.println("Salary Employee em3 = " + em3.salary());
		System.out.println("Bonus Employee em1 = " + em1.bonuses());
		System.out.println("Bonus Employee em2 = " + em2.bonuses());
		System.out.println("Bonus Employee em3 = " + em3.bonuses());
		System.out.println("Total salary = " + Employee.totalsum());
		em2.changeRate(14);
		System.out.println("Salary Employee em2 = " + em2.salary());
		System.out.println("Bonus Employee em2 = " + em2.bonuses());
		System.out.println("Total salary = " + Employee.totalsum());
		
	}

}
