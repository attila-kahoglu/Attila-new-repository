package com.unitedcodernigar.cubecartautomation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unitedcodernigar.jsonfile.FunctionLibrary;

import java.io.File;
import java.io.IOException;

public class CubeCartAutomationWithJson extends FunctionLibrary {
    public static void main(String[] args) {

        // map json data to test dat
        ObjectMapper objectMapper = new ObjectMapper();
        JsonObject jsonObject;
        try {
            jsonObject = objectMapper.readValue(new File("testdatafolders/cubecart-test-data.json"),
                    JsonObject.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        openBrowser();
        login(jsonObject.getLoginUser());
        addProduct(jsonObject.getProduct());
        //addCustomer(jsonObject.getCustomer());
        logOut();
        closeBrowser();

    }
}
