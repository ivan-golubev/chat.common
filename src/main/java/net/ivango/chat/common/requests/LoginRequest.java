package net.ivango.chat.common.requests;


public class LoginRequest implements Message {
    private String userName;

    public LoginRequest(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

}
