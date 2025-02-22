package com.springboot.Sprinboot;

import org.springframework.stereotype.Service;
import java.time.Instant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class RateLimitService {
    private final Map<String, RequestData> requestMap = new ConcurrentHashMap<>();
    private static final int REQUEST_LIMIT = 5; // Max 5 requests per minute
    private static final long TIME_FRAME = 60 * 1000; // 1 minute window

    static class RequestData {
        int count;
        long startTime;

        RequestData() {
            this.count = 1;
            this.startTime = Instant.now().toEpochMilli();
        }
    }

    public boolean isRequestAllowed(String ipAddress) {
        long currentTime = Instant.now().toEpochMilli();

        requestMap.entrySet().removeIf(entry -> currentTime - entry.getValue().startTime > TIME_FRAME);

        RequestData requestData = requestMap.get(ipAddress);

        if (requestData == null) {
            requestMap.put(ipAddress, new RequestData());
            return true;
        }

        if (currentTime - requestData.startTime > TIME_FRAME) {
            requestMap.put(ipAddress, new RequestData());
            return true;
        }

        if (requestData.count >= REQUEST_LIMIT) {
            return false; // Block the request properly
        }

        requestData.count++;
        return true;
    }

    public void resetLimit(String ipAddress) {
        requestMap.remove(ipAddress);
        System.out.println("Rate limit reset for IP: " + ipAddress);
    }
}
