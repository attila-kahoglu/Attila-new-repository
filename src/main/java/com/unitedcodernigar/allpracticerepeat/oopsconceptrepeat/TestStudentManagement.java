package com.unitedcodernigar.allpracticerepeat.oopsconceptrepeat;

import java.util.Arrays;
import java.util.HashSet;

public class TestStudentManagement {
    public static void main(String[] args) {

        StudentInfo studentInfo = new StudentInfo(97,"Sara","Jon","25-02-2005",
                18,"female","sara@gmail.com","English Literature");
        System.out.println(studentInfo);
        System.out.println();


        GraduateStudentInfo Graduate = new GraduateStudentInfo(103,"Alex","Mahon","13-05-1995",28,
                "Male","alex@gmail.com","International Business","Marketing price","Alex");
        System.out.println(Graduate);
        System.out.println();


        DoctorInfo doctor = new DoctorInfo(54,"Lenkon","Brous","16-08-1992",31,"female","len@gmail.com", "IT","SEDET",
                "Engineer",4000,
                Arrays.asList("Network Fundamentals","Lekon Brous"));
        System.out.println(doctor);













    }
}
