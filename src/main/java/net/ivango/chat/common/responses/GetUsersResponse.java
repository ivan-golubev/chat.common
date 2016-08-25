package net.ivango.chat.common.responses;

import net.ivango.chat.common.requests.Message;

import java.util.List;

public class GetUsersResponse implements Message {
    private List<User> users;

    public GetUsersResponse(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }
}
