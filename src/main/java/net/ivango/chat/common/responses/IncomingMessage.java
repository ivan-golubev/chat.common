package net.ivango.chat.common.responses;

import net.ivango.chat.common.requests.Message;

public class IncomingMessage implements Message {
    private String from, message;
    private boolean broadcast;

    public IncomingMessage(String from, String message, boolean broadcast) {
        this.from = from;
        this.message = message;
        this.broadcast = broadcast;
    }

    public String getFrom() {
        return from;
    }

    public String getMessage() {
        return message;
    }

    public boolean isBroadcast() {
        return broadcast;
    }
}
