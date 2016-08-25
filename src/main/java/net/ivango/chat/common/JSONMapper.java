package net.ivango.chat.common;


import com.google.gson.*;
import net.ivango.chat.common.misc.HandlerMap;
import net.ivango.chat.common.requests.LoginRequest;
import net.ivango.chat.common.requests.Message;

import java.util.HashMap;
import java.util.Map;

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

//    public static void main(String[] args) throws ClassNotFoundException {
//        JSONMapper jsonMapper = new JSONMapper();
//
//        Message loginRequest = new LoginRequest("Boris");
//        String json = jsonMapper.toJSON(loginRequest);
//
//        Message loginRequest1 = (Message) jsonMapper.fromJson(json);
//
//        HandlerMap map = new HandlerMap();
//        map.put(LoginRequest.class, l -> System.out.println("LoginMessage received !"));
//
//        map.get(loginRequest1.getClass()).onMessageReceived(loginRequest1);
//    }

}
