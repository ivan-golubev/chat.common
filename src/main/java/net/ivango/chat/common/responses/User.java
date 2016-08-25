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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!userName.equals(user.userName)) return false;
        return address.equals(user.address);

    }

    @Override
    public int hashCode() {
        int result = userName.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }
}
