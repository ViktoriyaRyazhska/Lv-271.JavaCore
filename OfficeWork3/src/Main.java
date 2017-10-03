
public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Vasya");
		e1.setHours(5);
		e1.changeRate(9);
		Employee e2 = new Employee("Petya",11);
		e2.setHours(4);
		Employee e3 = new Employee("Kolya",10,8);
		e3.changeRate(8);
		Employee.TotalSum();

	}

}
