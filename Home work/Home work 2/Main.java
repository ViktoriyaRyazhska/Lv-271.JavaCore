package HW;

public class Main {
	public static void main(String[] args) {
	Person per1 = new Person();
	per1.setName("VAsia");
	per1.setBirthYear(1950);
	
	Person per2 = new Person("Taras", 1970);
	Person per3 = new Person("Kolia", 2010);
	Person per4 = new Person("Vitalic", 1990);
	Person per5 = new Person("Roman", 1980);
	
	per5.setName("Petro");
	per1.output();
	per2.output();
	per3.output();
	per4.output();
	per5.output();
	
	//System.out.println(per1);
	//System.out.println(per2);
	//System.out.println(per3);
	//System.out.println(per4);
	//System.out.println(per5);
	}
}
