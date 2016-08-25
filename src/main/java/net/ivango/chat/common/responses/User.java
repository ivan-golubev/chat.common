package net.ivango.chat.common.responses;

public class User {
    private String userName, address;

    public User(String userName, String address) {
        this.userName = userName;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return userName;
    }
}
