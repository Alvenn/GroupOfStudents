package com.gmail.alvenn89;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        Student one = new Student("Vasya", "Pupkin", 21);
        Student eleven = new Student("Ivan", "Pupkinenko", 26);

        group.addStudent(eleven);

        for (int i = 0; i < 10; i++) {
            try {
                 group.addStudent(one);
            }
            catch (OversizeAddingException e){
                System.out.println("Group is full");
            }
        }

        try {
            group.addStudent(eleven);
        }
        catch (OversizeAddingException e){
            System.out.println("Group is full");
        }

        group.searchBySecondName("Pupkinenko");

        group.getStudent(2).printInfo();

        System.out.println(one.getAge());
        System.out.println(group.getStudent(2).getSecondName());

    }
}
