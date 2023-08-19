package com.unitedcodernigar.oopsconcept.inheritancetutorial;

import java.util.List;

public class DoctorStudent extends GraduateStudent {
    private String thesisTopic;
    private List<String> publication;
    public DoctorStudent(){
    }

    public DoctorStudent(String thesisTopic, List<String> publication) {
        this.thesisTopic = thesisTopic;
        this.publication = publication;
    }

    public DoctorStudent(long studentID, String firstName, String lastName, String className,
                         int age, String major, String birthday, String advisorName, String researchProject,
                         String thesisTopic, List<String> publication) {
        super(studentID, firstName, lastName, className, age, major, birthday, advisorName, researchProject);
        this.thesisTopic = thesisTopic;
        this.publication = publication;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public List<String> getPublication() {
        return publication;
    }
    public String toString(){
        return super.toString()+" , "+thesisTopic+" , "+publication;
    }
}
