package com.unitedcodernigar.cubecartautomation;

public class LoginUser1NClass {
    private String userName;
    private String password;
    private String email;
    private String userType;

    public LoginUser1NClass() {
    }

    public LoginUser1NClass(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public LoginUser1NClass(String userName, String password, String email, String userType) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }
}
