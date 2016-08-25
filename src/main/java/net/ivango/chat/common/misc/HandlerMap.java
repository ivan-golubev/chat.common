package net.ivango.chat.common.misc;

import net.ivango.chat.common.requests.Message;

import java.util.HashMap;
import java.util.Map;

public class HandlerMap {
    private Map<Class, MessageHandler> handlerMap = new HashMap<>();

    /**
     * This method ensures that specified handler
     * can handle objects of the specified type
     */
    public <T extends Message> void put(Class<T> tclass, MessageHandler<T> handler) {
        handlerMap.put(tclass, handler);
    }

    public MessageHandler get(Class tclass) { return handlerMap.get(tclass); }
}
