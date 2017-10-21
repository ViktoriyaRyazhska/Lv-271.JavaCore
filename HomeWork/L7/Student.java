package HomeWork.L7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {

	private String name;
	private int course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public Student() {
	}
	
	

	// List<String> students = new ArrayList<String>();

	@Override
	public String toString() {
		return "Student name " + name + ", course " + course + ".";
	}

	static void printStudents(List<Student> students) {
		System.out.println("These students studying at course :");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
	}

	static CompareStudentsName compareStudentsName = new CompareStudentsName();
	static CompareStudentsCourse compareStudentsCourse = new CompareStudentsCourse();
	
	public static Comparator<Student> getcompareStudentsName() {
		return compareStudentsName;
	}
	public static Comparator<Student> getcompareStudentsCourse() {
		return compareStudentsCourse;
	}

	static class CompareStudentsName implements Comparator<Student> {

		public int compare(Student o1, Student o2) {
			return ((Student) o1).name.compareTo(((Student) o2).name);
		}
	}

	static class CompareStudentsCourse implements Comparator<Student> {

		public int compare(Student o1, Student o2) {
			return ((Student) o1).course - ((Student) o2).course;
		}
	}
	
	
public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Igor", 3));
		students.add(new Student("George", 2));
		students.add(new Student("Vasya", 4));
		students.add(new Student("Ben", 1));
		students.add(new Student("Roman", 5));
		
//		Student.printStudents(students);
		
		students.sort(getcompareStudentsName());
		for(Student s : students)
		{
			System.out.println("Name: " + s);
		}
		students.sort(getcompareStudentsCourse());
		for(Student s : students)
		{
			System.out.println("Course: " + s);
		}

//		System.out.println(Student.getcompareStudentsName());
		
	}



	// methods to compare students by name and by course

}

/*
 * method printStudents (List students, Integer course), which receives a list
 * of students and the course number and prints to the console the names of the
 * students from the list, which are taught in this course (use an iterator)
 * 
 * 
 * 
 */
