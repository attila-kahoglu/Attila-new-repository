package com.unitedcodernigar.allpracticerepeat.oopsconceptrepeat;

public class GraduateStudentInfo extends StudentInfo{
    private String thesis;
    private String advisorName;

    public GraduateStudentInfo(){
    }
    public GraduateStudentInfo(String thesis, String advisorName) {
        this.thesis = thesis;
        this.advisorName = advisorName;
    }
    public GraduateStudentInfo(long studentID, String firstName, String lastName, String birtDay,
                               int age, String gender, String email, String major, String thesis, String advisorName) {
        super(studentID, firstName, lastName, birtDay, age, gender, email, major);
        this.thesis = thesis;
        this.advisorName = advisorName;
    }

    public String getThesis() {
        return thesis;
    }
    public String getAdvisorName() {
        return advisorName;
    }

    public String toString(){
        return super.toString()+" , "+thesis+" , "+advisorName;
    }




}
