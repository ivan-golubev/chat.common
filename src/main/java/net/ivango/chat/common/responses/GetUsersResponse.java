package net.ivango.chat.common.responses;

import java.util.List;

public class GetUsersResponse implements Response {
    private List<User> users;

    public GetUsersResponse(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }
}
