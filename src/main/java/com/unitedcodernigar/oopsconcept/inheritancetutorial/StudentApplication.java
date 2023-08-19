package com.unitedcodernigar.oopsconcept.inheritancetutorial;

import java.util.Arrays;

public class StudentApplication {
    public static void main(String[] args) {

        Student student = new Student(102,"Mike","Smith","IT",20,
                "SDET","13-6-2004");
        System.out.println(student);
        System.out.println("Below are Graduate Student Info: ");



        GraduateStudent graduateStudent = new GraduateStudent(205,"David","Smith", "Java",
                23,"Developer", "2008-10-23","Dolkun","E-Commerce Application");
        System.out.println(graduateStudent);
        System.out.println("Below are Doctor Student Info: ");


        DoctorStudent doctorStudent = new DoctorStudent(8754,"Jake","Mike","ClassA",
                28,"Computer Science","2012-03-06",
                "Tarim","BlockChain Technology","BlockChain privacy",
                Arrays.asList("Hacking in BlockChain","privacy Enhancement in BlockChain"));
        System.out.println(doctorStudent);






    }
}
