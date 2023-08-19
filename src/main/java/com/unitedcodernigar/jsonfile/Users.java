package com.unitedcodernigar.jsonfile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unitedcodernigar.cubecartautomation.LoginUser1NClass;

import java.util.List;

public class Users {
    @JsonProperty("users")
    private List<LoginUser1NClass> users;
    public Users() {
    }
    public Users(List<LoginUser1NClass> users) {
        this.users = users;
    }
}
