package PractiseTask.l6;

public class Main {

	public static void main(String[] args) {

		Animal[] animals = new Animal[5];
		animals[0] = new Cat(true);
		animals[1] = new Dog(false);
		animals[2] = new Cat(false);
		animals[3] = new Dog(true);
		animals[4] = new Dog();
		animals[4].setFeed(true);
		for(int i=0; i<animals.length; i++){
			animals[i].voice();
			animals[i].feed();
		}
		Person[] people = new Person[3];
		people[0] = new Teacher(4500);
		people[1] = new Cleaner();
		people[2] = new Student();
		for (int i=0; i<people.length; i++){
			people[i].print();
		}
		((Cleaner)people[1]).setSalary(3400);
		((Staff)people[0]).salary();
		((Staff)people[1]).salary();
		
	}
}
