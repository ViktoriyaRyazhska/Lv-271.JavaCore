
public class Person {
	
	private String name;
	private int birthYear;	
	
	public Person() {};
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
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
	
	public int Age() {
		return 2017 - this.birthYear;
	}
	public void Input(String name, int year) {
		this.name = name;
		this.birthYear = year;
	}
	public void Output() {
		System.out.println("Name - " + this.name);
		System.out.println("Age - " + this.Age());
	}
	public void changeName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", Age=" + Age() + "]";
	}
	
}
