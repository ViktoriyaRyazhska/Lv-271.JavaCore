package homework.hw3;

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
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public Person(String name){
		this.name = name;
	}
	public Person(int year){
		this.birthYear = year;
	}
	public Person(){
	}
	public int age(){
		return 2017 - birthYear;
	}
	public void input(String name, int year){
		this.name = name;
		this.birthYear = year;
	}
	public void output(){
		System.out.println(this.name + "'s age is " + this.age());
	}
	public void changeName( String name){
		System.out.println(this.name + " changed name and now he is " + name);
		this.name = name;
	}
}
