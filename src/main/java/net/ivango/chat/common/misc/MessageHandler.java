package net.ivango.chat.common.misc;


import net.ivango.chat.common.requests.Message;

public interface MessageHandler<T extends Message> {
    public void onMessageReceived(T t, String address);
}
