
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SoftHome71 {
    public static void main(String[] args) {

           List<Student> students= Student.printStudents();

            System.out.println("Сортування по імені");
            students.sort(new NameComparator());
            for (Student stud : students) {
                    System.out.println(stud);
            }
            System.out.println("Сортування по курсу");
            students.sort(new TabComparator());
            for (Student stud : students) {
                    System.out.println(stud);
            }
}


static class NameComparator implements Comparator<Student>{
                @Override
                public int compare(Student s1, Student s2) {
                        return s1.name.compareTo(s2.name);
                }
        }
       static public class TabComparator implements Comparator<Student>{
                @Override
                public int compare(Student s1, Student s2) {
                        return s1.cours - s2.cours;
                }
        }

        static class Student {

                private String name;
                private int cours;

                public String getName(){
                 return name;
                }

        public void setName(String name){
                this.name=name;
        }

        public int getCours(){
                return cours;
        }

        public void setCours(int cours){
                this.cours=cours;
        }

        Student(){}
        Student(String name,int cours){
        this.name=name;
        this.cours=cours;
        }

        @Override
                public String toString(){

            return"Student [Name="+name+",cours="+cours+"]";
         }

                static List<Student> printStudents(){
                 List<Student> students = new ArrayList<Student>();

                 students.add(new Student("Vasya", 3));
                 students.add(new Student("Anna", 2));
                 students.add(new Student("Alina", 4));
                 students.add(new Student("Petro", 1));
                 students.add(new Student("Charli", 5));
                    return students;
                }

        }
}

