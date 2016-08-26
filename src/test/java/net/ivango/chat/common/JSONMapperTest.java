package net.ivango.chat.common;


import net.ivango.chat.common.requests.SendMessageRequest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JSONMapperTest {

    @Test
    public void test() throws ClassNotFoundException {
        SendMessageRequest message1 = new SendMessageRequest("Boris", "message", false);
        JSONMapper jsonMapper = new JSONMapper();

        String json1 = jsonMapper.toJSON(message1);

        SendMessageRequest message2 = (SendMessageRequest) jsonMapper.fromJson(json1);

        assertEquals(message1.getMessage(), message2.getMessage());
        assertEquals(message1.getReceiver(), message2.getReceiver());
        assertEquals(message1.isBroadcast(), message2.isBroadcast());
        assertEquals(json1, jsonMapper.toJSON(message2));
    }
}
