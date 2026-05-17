package org.example.Clone.DeepCloning;

class Passport implements Cloneable{
    String passportNumber;
    Passport(String passportNumber){
        this.passportNumber=passportNumber;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}

class Student implements Cloneable{
    String name;
    Passport passport;

    Student(String name, Passport passport){
        this.name=name;
        this.passport=passport;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student =(Student) super.clone();
        student.passport=(Passport) passport.clone();
        return student;
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Passport passport= new Passport("3412431243");
        Student student=new Student("Rohan", passport);

        Student clonedStudent= (Student) student.clone();

        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        System.out.println(clonedStudent.name);
        System.out.println(clonedStudent.passport.passportNumber);
        System.out.println();

        clonedStudent.name="Rahul";
        clonedStudent.passport.passportNumber="0986784";

        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        System.out.println(clonedStudent.name);
        System.out.println(clonedStudent.passport.passportNumber);
    }
}
