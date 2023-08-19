package com.unitedcodernigar.oopsconcept.abstracttutorial;

public class TestBank {
    public static void main(String[] args) {

        Bank bank = new HSBCBank();
        bank.balance=1000;
        bank.loan();
        bank.credit();
        HSBCBank hsbcBank = new HSBCBank();
        hsbcBank.credit();



    }
}
