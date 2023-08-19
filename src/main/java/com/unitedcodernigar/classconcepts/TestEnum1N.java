package com.unitedcodernigar.classconcepts;

// QA Staging prod  URl
enum level {
   LOW,Medium,High
}
public class TestEnum1N {
    public static void main(String[] args) {
        System.out.println(level.High);
        level l = level.High;
        switch (l) {
            case LOW:
                System.out.println("Low level");
                break;
            case Medium:
                System.out.println("Medium level");
                break;
            case High:
                System.out.println("High level");
                break;
        }
    }
}
