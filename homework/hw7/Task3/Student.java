package homework.hw7.Task3;

import java.util.ArrayList;
import java.util.Iterator;

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

	public Student() {
	}

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public void printStudents(ArrayList<Student> list, Integer course) {
		Iterator<Student> it = list.iterator();
		int count = 0;
		while(it.hasNext()){
			Student stud = (Student) it.next();
			if(stud.getCourse()==course){
				count++;
				System.out.println(count + " " + stud.getName());
			}
		}
		if(count==0){
			System.out.println("Wrong course!");
		}
	}

	@Override
	public String toString() {
		return "Student " + name + " course: " + course;
	}
}
