package org.example;

class outerClass{
    static int val=10;

    class InnerClass{
        public void execute(){
            System.out.println("Inner Class executed "+ val);
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        outerClass.InnerClass innerClass=new outerClass().new InnerClass();
        innerClass.execute();
    }
}
