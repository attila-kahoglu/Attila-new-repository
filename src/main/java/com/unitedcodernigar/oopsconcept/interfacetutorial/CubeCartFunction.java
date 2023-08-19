package com.unitedcodernigar.oopsconcept.interfacetutorial;

import com.unitedcodernigar.oopsconcept.inheritancetutorial.BaseClass;

public interface CubeCartFunction {

    void login(String userName, String password);
    void addCustomer();
    boolean verifyCustomerAdded();

}
class Function implements CubeCartFunction{

    @Override
    public void login(String userName, String password) {

    }

    @Override
    public void addCustomer() {

    }

    @Override
    public boolean verifyCustomerAdded() {
        return false;
    }
}

class Test extends BaseClass{
    public static void main(String[] args) {

        Function function = new Function();
        function.login("testautomation1","automation123!");




    }
}