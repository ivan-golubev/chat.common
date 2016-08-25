package net.ivango.chat.common.responses;

import net.ivango.chat.common.requests.Message;

public class GetTimeResponse implements Message {
    private long utcServerTime;

    public GetTimeResponse(long utcServerTime) {
        this.utcServerTime = utcServerTime;
    }

    public long getUtcServerTime() {
        return utcServerTime;
    }
}
