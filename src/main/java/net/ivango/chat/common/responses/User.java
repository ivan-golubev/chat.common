package net.ivango.chat.common.responses;

public class User {
    private String userName, address;
    private int messageCount;

    public User(String userName, String address, int messageCount) {
        this.userName = userName;
        this.address = address;
        this.messageCount = messageCount;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddress() {
        return address;
    }

    public int getMessageCount() {
        return messageCount;
    }
}
