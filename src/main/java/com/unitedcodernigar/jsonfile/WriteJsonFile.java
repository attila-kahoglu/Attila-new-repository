package com.unitedcodernigar.jsonfile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unitedcodernigar.cubecartautomation.LoginUser1NClass;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class WriteJsonFile {
    public static void main(String[] args) {

        LoginUser1NClass loginUser = new LoginUser1NClass("test","automation",
                "abs@gmail.com","Admin");
        ObjectMapper mapper = new ObjectMapper();
        String user = null;
        try {
            user = mapper.writeValueAsString(loginUser);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        try {
            FileUtils.writeStringToFile(new File("jsonfiles/user-Info.json"),user);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
