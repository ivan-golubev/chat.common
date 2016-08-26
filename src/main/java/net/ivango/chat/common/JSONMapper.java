package net.ivango.chat.common;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.ivango.chat.common.requests.Message;

import java.util.HashMap;
import java.util.Map;

/**
 * Maps messages to JSON and back.
 * Adds type info to the payload.
 * */
public class JSONMapper {

    private final static String TYPE_FIELD = "type", VALUE_FIELD = "value";

    private Gson gson = new GsonBuilder().create();

    public String toJSON(Message request) {
        Map<String, Object> map = new HashMap<>();
        map.put(TYPE_FIELD, request.getClass().getCanonicalName());
        map.put(VALUE_FIELD, request);
        return gson.toJson(map);
    }

    public Object fromJson(String json) throws ClassNotFoundException {
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
        Class type = Class.forName(jsonObject.get(TYPE_FIELD).getAsString());
        return gson.fromJson(jsonObject.getAsJsonObject(VALUE_FIELD), type);
    }
}
