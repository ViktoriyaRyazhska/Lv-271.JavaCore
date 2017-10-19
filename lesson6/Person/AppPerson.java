package lesson6;

public class AppPerson {

	public static void main(String[] args) {
		Person[] person = new Person[6];
		person[0] = new Student("Andriy");
		person[1] = new Student("Oleg");
		person[2] = new Cleaner("Stepan", 4500);
		person[3] = new Cleaner("Olga", 5400);
		person[4] = new Teacher("Bob", 9400);
		person[5] = new Teacher("Julia", 9700);
		
		for(int i=0; i<2; i++) {
			person[i].print();
		}
		for(int i=2; i<person.length; i++) {
			person[i].print();
			((Staff)person[i]).Salary();
		}
		
	}

}
