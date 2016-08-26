package net.ivango.chat.common.misc;


import net.ivango.chat.common.requests.Message;

/**
 * Message handler used to process the specific message.
 * Used in conjunction with the HandlerMap.
 * */
public interface MessageHandler<T extends Message> {
    public void onMessageReceived(T t, String address);
}
