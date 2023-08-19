package com.unitedcodernigar.classconcepts;

public class KeywordsInJava {
    public void finalize(){
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        KeywordsInJava k = new KeywordsInJava();
        KeywordsInJava k1 = new KeywordsInJava();
        k = null;
        k1 = null;
        System.gc();
    }
}
