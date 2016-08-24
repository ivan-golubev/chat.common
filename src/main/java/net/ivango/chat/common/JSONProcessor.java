package net.ivango.chat.common;


import com.google.gson.*;
import net.ivango.chat.common.requests.Request;
import net.ivango.chat.common.responses.Response;

import java.lang.reflect.Type;

public class JSONProcessor {

    private final static String TYPE_FIELD = "type";

    private JsonDeserializer<Request> deserializer = new JsonDeserializer<Request>(){
        @Override
        public Request deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            if ( json.isJsonObject() ) {
                JsonObject jo = json.getAsJsonObject();
                String type = jo.get(TYPE_FIELD).getAsString();

            }
            return null;
        }
    };

    private JsonSerializer<Request> serializer = new JsonSerializer<Request>() {
        @Override
        public JsonElement serialize(Request src, Type typeOfSrc, JsonSerializationContext context) {
            JsonObject jo = new JsonObject();
            jo.addProperty(TYPE_FIELD, src.getClass().getName());
            return jo;
        }
    };

    private Gson gson = new GsonBuilder()
            .registerTypeAdapter(Request.class, serializer)
            .registerTypeAdapter(Request.class, deserializer)
            .create();

//    public String toJSON(Request request) {}
//    public String toJSON(Response response) {}
//
//    public Request fromJSONRequest(String json) {}
//    public Response fromJSONResponse(String json) {}

}
