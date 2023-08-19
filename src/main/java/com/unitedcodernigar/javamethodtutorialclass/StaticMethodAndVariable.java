package com.unitedcodernigar.javamethodtutorialclass;

public class StaticMethodAndVariable {

    //  Static variables
    private static double accountBalance;
    private static String accountName;
    private static int accountNumber;
    public int deposit;
    public static int money;

    public StaticMethodAndVariable() {
    }

    public static double getAccountBalance() {
        return accountBalance;
    }

    public static void setAccountBalance(double accountBalance) {
        StaticMethodAndVariable.accountBalance = accountBalance;
    }

    public static String getAccountName() {
        return accountName;
    }

    public static void setAccountName(String accountName) {
        StaticMethodAndVariable.accountName = accountName;
    }

    public static int getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(int accountNumber) {
        StaticMethodAndVariable.accountNumber = accountNumber;
    }






}
