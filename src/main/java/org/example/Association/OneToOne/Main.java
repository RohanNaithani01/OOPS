package org.example.Association.OneToOne;

class Passport{
    private String passportNo;
    Passport(String passportNo){
        this.passportNo=passportNo;
    }

    public String getPassportNo(){
        return passportNo;
    }
}

class Student{
    private String studentName;
    private Passport passport;

    Student(String studentName, Passport passport){
        this.studentName=studentName;
        this.passport=passport;
    }

    public void getStudentDetails(){
        System.out.println("Student Name: "+studentName);
        System.out.println("Passport No: "+passport.getPassportNo());
    }

}
public class Main {
    public static void main(String[] args) {
        Passport passport=new Passport("324738649");
        Student student=new Student("Rohan", passport);
        student.getStudentDetails();
    }
}
