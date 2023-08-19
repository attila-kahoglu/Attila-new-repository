package com.unitedcodernigar.classconcepts;

public class ScopeOfVariable {
    // class level / local variable
    String s = "AA";
    int x = 100;
    static int y =900;

    public void sum(){
        int x=900;
    }

    public static void main(String[] args) {
        ScopeOfVariable s = new ScopeOfVariable();
        System.out.println(s.x);
        System.out.println(y);
        int x = 200;
    }
}
