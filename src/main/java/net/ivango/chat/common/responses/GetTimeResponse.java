package net.ivango.chat.common.responses;

public class GetTimeResponse implements Response {
    private long utcServerTime;

    public GetTimeResponse(long utcServerTime) {
        this.utcServerTime = utcServerTime;
    }

    public long getUtcServerTime() {
        return utcServerTime;
    }
}
