package homework7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private int course;
	public Student() {
	}
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
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
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
	static void printStudents(List<Student> students) {
		Iterator it = students.iterator();
		while(it.hasNext()) {
			System.out.println((Student)it.next());
			}
	}
	static class CompareName implements Comparator<Student> {
		public int compare(Student o1, Student o2) {
			return ((Student) o1).name.compareTo(((Student) o2).name);
			}
		}

	static class CompareCourse implements Comparator<Student> {
		public int compare(Student o1, Student o2) {
			return ((Student) o1).course - ((Student) o2).course;
			}
		}

	public static void main(String[] args) {
			List<Student> students = new ArrayList<Student>();
			
			students.add(new Student("Andriy", 2));
			students.add(new Student("Solomija", 1));
			students.add(new Student("Oksana", 3));
			students.add(new Student("Ivan", 4));
			students.add(new Student("Olya", 5));
			Student.printStudents(students);
			System.out.println("Sort by name:");
			students.sort(new CompareName());
			Iterator i = students.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
				}
			System.out.println("Sort by course:");
			students.sort(new CompareCourse());
			Iterator y = students.iterator();
			while(y.hasNext()) {
				System.out.println(y.next());
				}
	}
	
}

