package com.unitedcodernigar.allpracticerepeat.oopsconceptrepeat;

public class StudentInfo {
    private long studentID;
    private String firstName;
    private String lastName;
    private String birtDay;
    private int age;
    private String gender;
    private String email;
    private String major;

    public StudentInfo(){
    }

    public StudentInfo(long studentID, String firstName, String lastName, String birtDay,
                       int age, String gender, String email, String major) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtDay = birtDay;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.major = major;
    }

    public long getStudentID() {
        return studentID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getBirtDay() {
        return birtDay;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getEmail() {
        return email;
    }
    public String getMajor() {
        return major;
    }

    @Override
    public String toString(){
        return studentID+" , "+firstName+" , "+lastName+" , "+birtDay
                +" , "+age+" , "+gender+" , "+email+" , "+major;
    }

}
