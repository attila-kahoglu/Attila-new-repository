package com.unitedcodernigar.classconcepts.pachage1;

public class Alpha {
    public static void main(String[] args) {
        Alpha alpha = new Alpha();
        alpha.alphaInfo = "Info";
        alpha.set("Alpha1");
        System.out.println(alpha.getAlphaInfo());


    }
    private String alphaInfo;
    public String alphaVersion;

    protected int age;
    void getAge() {
        System.out.println(age);
    }

    int year;
    void getYear() {
        System.out.println(year);
    }

    public Alpha() {
    }

    public Alpha(String alphaInfo) {
        this.alphaInfo = alphaInfo;
    }

    public String getAlphaInfo() {
        return alphaInfo;
    }

    public void setAlphaInfo(String alphaInfo) {
        this.alphaInfo = alphaInfo;
    }

    public void set(String alphaInfo) {         // this is new way  / my comment !
        setAlphaInfo(alphaInfo);
    }


}
