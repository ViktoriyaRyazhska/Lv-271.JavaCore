package HW;

import java.util.Date;

public class Person {
	
	private String name;
	private int birthYear;
	
	
	
	public Person() {
	}

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

	

	public int age(){
		Date data=new Date();
		int carrentYear = data.getYear();			//?????????????????????????????????
		
		return (carrentYear+1900-this.birthYear);	//??????????????????????????
	}
	
	public void output(){
		System.out.println("name: "+this.name+", birth Year: " + this.birthYear + ", age: " + age() + " years old");
	}
	
	//@Override
	//public String toString() {
	//	return "Person [name: " + name + ", birth Year: " + birthYear + ", age: " + age() + " years old" + "]";
	//}
	

}
