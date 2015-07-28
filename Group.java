package com.gmail.alvenn89;

public class Group {
    Student [] array = new Student[10];

    public Student getStudent(int index) {
        return array[index];
    }

    public void searchBySecondName(String secondName){
        int count = 0;
        System.out.println("\nSearch results:");
        for (int i = 0; i < array.length ; i++) {

            try{
                if(secondName.equals(array[i].getSecondName())){
                    array[i].printInfo();
                    count++;
                }
            }
            catch (NullPointerException e){
            }
        }

        if(count == 0){
            System.out.println("Student not found");
        }
        System.out.println();
    }

    public void addStudent(Student student) throws OversizeAddingException{
        int stop = 0;
        for (int i = 0; stop < 1; i++) {
            try{
                if (array[i] == null) {
                    array[i] = student;
                    stop++;
                    array[i].printInfo();
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                throw new OversizeAddingException();
            }
        }
    }
}
