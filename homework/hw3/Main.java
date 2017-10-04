package homework.hw3;

public class Main {

	public static void main(String[] args) {
		Person guy1 = new Person();
		Person guy2 = new Person("Oleg", 1995);
		Person guy3 = new Person();
		Person guy4 = new Person("Vasya");
		Person guy5 = new Person(1988);
		guy1.input("Rostyk", 2001);
		guy3.input("Andriy", 1992);
		guy4.setBirthYear(1999);
		guy5.setName("Yura");
		guy1.output();
		guy2.output();
		guy3.output();
		guy4.output();
		guy5.output();
		guy4.changeName("Ruslan");
		guy4.output();
		
	}

}
