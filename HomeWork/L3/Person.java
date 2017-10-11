import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Person {

	private String name;
	private int birthYear;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	

	public Person() {
		}
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public int age() {
		return 2017 - birthYear;
	}
	
	public void input(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public void output()
	{
		System.out.println("Person name = " + name + ", birthYear = " + birthYear + ", age = " + age() + ".");
	}
	
	@Override
	public String toString() {
		return "Person name = " + name + ", birthYear = " + birthYear + ", age = " + age() + ".";
	}

	
	
	
	public String chageName(String name) {
		return this.name = name;
	}

	public static void main(String[] args) {
		Person person1 = new Person("Yra", 1999);
		Person person2 = new Person("Gora", 1865);
		Person person3 = new Person("Vasya", 2000);
		Person person4 = new Person("Pedro", 1967);
		Person person5 = new Person("Ira", 1980);
		
		person2.output();
		System.out.println(person5);
		
		

	}
}

