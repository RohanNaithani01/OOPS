package org.example.Association.OneToMany;

import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private String id;
    Student(String name, String id){
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

class Collage{
    private String name;
    private List<Student> students;

    Collage(String name){
        this.name=name;
        students=new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);

    }
    public void printAllStudents(){
        for(int i=0;i<students.size();i++){
            Student student=students.get(i);
            System.out.println("Name "+ student.getName() + " Id: "+student.getId());
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Student student1=new Student("Rohan","1");
        Student student2=new Student("Rohit","2");
        Student student3=new Student("Rahul","3");

        Collage collage =new Collage(("JKU"));
        collage.addStudent(student1);
        collage.addStudent(student2);
        collage.addStudent(student3);
        collage.printAllStudents();


    }
}
