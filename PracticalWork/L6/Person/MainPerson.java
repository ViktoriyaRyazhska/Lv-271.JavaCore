package PracticalWork.L5.L6;

public class MainPerson {

	public static void main(String[] args) {

		Person[] person = new Person[4];

		person[0] = new Student();
		person[1] = new Student();
		person[2] = new Teacher();
		person[3] = new Cleaner();

		for (int i = 0; i < person.length; i++) {
			person[i].print();
			if (person[i] instanceof Staff) {
				System.out.println(((Staff) person[i]).salary());
			}
		}

	}

}
