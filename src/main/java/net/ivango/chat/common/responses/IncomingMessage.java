package net.ivango.chat.common.responses;

import net.ivango.chat.common.requests.Message;

public class IncomingMessage implements Message {
    private String from, senderName, message;
    private boolean broadcast;

    public IncomingMessage(String from, String senderName, String message, boolean broadcast) {
        this.from = from;
        this.senderName = senderName;
        this.message = message;
        this.broadcast = broadcast;
    }

    public String getFrom() {
        return from;
    }

    public String getMessage() {
        return message;
    }

    public String getSenderName() {
        return senderName;
    }

    public boolean isBroadcast() {
        return broadcast;
    }
}
