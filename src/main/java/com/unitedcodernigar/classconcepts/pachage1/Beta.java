package com.unitedcodernigar.classconcepts.pachage1;

public class Beta {
    public static void main(String[] args) {
        Alpha alpha = new Alpha();
        alpha.alphaVersion="2.0";
        alpha.year=2022;
        alpha.getYear();
        alpha.age=22;
        alpha.getAge();
    }
    private String betaVersion;
    public Beta() {
    }

    public Beta(String betaVersion) {
        this.betaVersion = betaVersion;
    }

    public String getBetaVersion() {
        return betaVersion;
    }

    public void setBetaVersion(String betaVersion) {
        this.betaVersion = betaVersion;
    }


}
