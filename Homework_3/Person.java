package homework3;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Person {
	private String name;
	private int birthYear;
	
	public Person() {
	}
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public static int present_year(){
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
		calendar.setTime(new Date());
		return calendar.get(Calendar.YEAR);
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
	public int age() {
		return (present_year() - birthYear);
	}
	public void input(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public void output() {
		System.out.println("Neme: " + name + ". Age " + age());
	}
	public void changeName(String name) {
		this.name = name;
	}
}
