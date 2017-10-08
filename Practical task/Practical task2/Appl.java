package l3;

public class Appl {
	public static void main(String[] args) {
		Employee em1 = new Employee();
		em1.setName("Ira");
		em1.setRait(5);
		em1.setHours(170);
		
			
		Employee em2 = new Employee("Vasia", 4);
		em2.setHours(10);
		Employee em3 = new Employee("Petro", 4, 180);
		em3.bonus();
		System.out.println(em1);
		System.out.println(em2);
		System.out.println(em3);
		System.out.println("Total salary: " + Employee.getTotalSalary());
	}

}
