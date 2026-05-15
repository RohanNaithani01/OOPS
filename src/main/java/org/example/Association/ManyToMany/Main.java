package org.example.Association.ManyToMany;

import java.util.ArrayList;
import java.util.List;

class Student{
    String name;
    private List<Course> courses;

    Student(String name){
        this.name=name;
        courses=new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public String getName(){
    return name;
    }

}
class Course{
    private String name;
    private List<Student> students;

    Course(String name){
        this.name=name;
        students=new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }


    public void displayAllStudents(){
        for(int i=0; i<students.size(); i++){
            System.out.println("Name "+students.get(i).getName());

        }
    }
}
public class Main {
    public static void main(String[] args) {
        Course math=new Course("Math");
        Course cs=new Course("CS");
        Course eng=new Course("English");

        Student rohan=new Student("Rohan");
        Student rohit= new Student("Rohit");
        Student Karan=new Student("Karan");

        rohan.addCourse(math);
        rohan.addCourse(cs);
        rohan.addCourse(eng);

        math.addStudent(rohan);
        cs.addStudent(rohan);
        eng.addStudent(rohan);

        rohit.addCourse(cs);
        cs.addStudent(rohit);

        Karan.addCourse(eng);
        Karan.addCourse(cs);
        eng.addStudent(Karan);
        cs.addStudent(Karan);

        math.displayAllStudents();
        System.out.println();


    }
}
