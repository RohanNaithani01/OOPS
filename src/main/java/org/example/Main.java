package org.example;

public class Main {
    public static void main(String[] args) {

//        Student student = new Student("Rohan");
//        student.printStudentName();
//        student.printSchoolName();
        Parent parent=new Parent("Anil","Rohan");
        parent.printParentName();
        parent.printStudentName();
        parent.printSchoolName();
        Teacher teacher=new Teacher("Rohit","Math");
        Student student=new Student("Rohan");
        teacher.printTeacherInfo();
        teacher.printSchoolName();
        student.printSchoolName();
        student.demo();

    }
}
class School {
    private String name;

    School() {
        name = "DPS";
    }

    void printSchoolName() {
        System.out.println("School name: " + name);
    }
    void demo(){
        System.out.println("This is a demo");
    }
}

class Student extends School {
    private String name;

    Student(String name) {
        this.name = name;
    }

    void printStudentName() {
        System.out.println("Student name: " + name);
    }
    @Override
    void demo(){
        super.demo();
        System.out.println("I dont like school's demo");
    }

}

class Parent extends Student {
    private String name;

    Parent(String name, String studentName) {
        super(studentName);
        this.name = name;
    }

    void printParentName() {
        System.out.println("Parent name: " + name);
    }
}

class Teacher extends School{
    private String name;
    private String subjectName;
    Teacher(String name, String subjectName){
        this.name=name;
        this.subjectName=subjectName;
    }
    void printTeacherInfo(){
        System.out.println("Name: "+name);
        System.out.println("Subject Name: "+ subjectName);
    }
        }

