package com.unitedcodernigar.allpracticerepeat.oopsconceptrepeat;

import java.util.List;

public class DoctorInfo extends GraduateStudentInfo{
    private long salary;
    private List<String> publication;

    public DoctorInfo(){
    }

    public DoctorInfo(long salary, List<String> publication) {
        this.salary = salary;
        this.publication = publication;
    }

    public DoctorInfo(long studentID, String firstName, String lastName, String birtDay, int age, String gender, String email,
                      String major, String thesis, String advisorName, long salary, List<String> publication) {
        super(studentID, firstName, lastName, birtDay, age, gender, email, major, thesis, advisorName);
        this.salary = salary;
        this.publication = publication;
    }

    public long getSalary() {
        return salary;
    }
    public List<String> getPublication() {
        return publication;
    }

    public String toString(){
        return super.toString()+" , "+salary+" , "+publication;
    }


}
