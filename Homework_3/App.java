package homework3;

public class App {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		person1.input("Ivan", 1988);
		person2.input("Elena", 1985);
		person3.input("Andrew", 1980);
		person4.input("Olga", 1994);
		person5.input("Julia", 1996);
		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();
		person1.changeName("Ivan Ivanovich");
		person1.output();
	}
}
