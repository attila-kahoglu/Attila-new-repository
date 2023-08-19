package com.unitedcodernigar.jsonfile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unitedcodernigar.cubecartautomation.LoginUser1NClass;
import com.unitedcodernigar.exceltutorial.LoginInfo;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteJsonWithMultipleObject {
    public static void main(String[] args) {

        LoginUser1NClass loginUser1 = new LoginUser1NClass("test","automation",
                "abs@gmail.com","Admin");
        LoginUser1NClass loginUser2 = new LoginUser1NClass("test","automation",
                "abs@gmail.com","Customer");
        LoginUser1NClass loginUser3 = new LoginUser1NClass("test","automation",
                "abs@gmail.com","Employee");

        List<LoginUser1NClass> users = new ArrayList<>();
        users.addAll(Arrays.asList(loginUser1,loginUser2,loginUser3));
        ObjectMapper mapper = new ObjectMapper();
        Users listOfUser = new Users(users);
        String objectValue = null;
        try {
            objectValue = mapper.writeValueAsString(listOfUser);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        try {
            FileUtils.writeStringToFile(new File("jsonfiles/users-info.json"),objectValue);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
