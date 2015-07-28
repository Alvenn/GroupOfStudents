package com.gmail.alvenn89;

public class Student extends Human {
    public Student(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    public Student(){
    }

    @Override
    public void printInfo() {
        System.out.println( this.getSecondName()+ " " + this.getFirstName() + " age is " + this.getAge());
    }
}
