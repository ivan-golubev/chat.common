package net.ivango.chat.common.responses;


public class BroadCastUser extends User {
    public static final BroadCastUser INSTANCE = new BroadCastUser();
    private BroadCastUser() {
        super("Everyone", "255.255.255.255");
    }
}
