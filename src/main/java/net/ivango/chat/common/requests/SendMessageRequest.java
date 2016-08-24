package net.ivango.chat.common.requests;

public class SendMessageRequest implements Request {
    private String receiver, message;
    private boolean broadcast;

    public SendMessageRequest(String receiver, String message, boolean broadcast) {
        this.receiver = receiver;
        this.message = message;
        this.broadcast = broadcast;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getMessage() {
        return message;
    }

    public boolean isBroadcast() {
        return broadcast;
    }
}
