package org.studentManagement;

public class StudentMain {
    public static void main(String[] args) {
        Student<String,Integer> student = new Student<>("Joe",12);
        Student<String,String> student2 = new Student<>("Joe","twelve");

        System.out.println(student.toString());
        System.out.println(student2.toString());
    }
}
