package com.unitedcodernigar.conditions;

public enum TypeDropDownValue {
    REGISTERED_CUSTOMER("Registered Customer"),
    UNREGISTERED_CUSTOMER("Unregistered Customer");
    private String value;
    TypeDropDownValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // this is just example, you can do it this way !!
    public static void main(String[] args) {
        System.out.println(TypeDropDownValue.REGISTERED_CUSTOMER.getValue());
        System.out.println(TypeDropDownValue.UNREGISTERED_CUSTOMER.getValue());
    }





}
