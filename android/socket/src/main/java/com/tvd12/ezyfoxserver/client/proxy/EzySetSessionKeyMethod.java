package com.tvd12.ezyfoxserver.client.proxy;

import com.facebook.react.bridge.ReadableMap;
import com.tvd12.ezyfoxserver.client.EzyClient;
import com.tvd12.ezyfoxserver.client.EzyMethodNames;

/**
 * Created by tavandung12 on 10/25/18.
 */

public class EzySetSessionKeyMethod extends EzyMethodProxy {
    @Override
    public Object invoke(ReadableMap params) {
        EzyClient client = getClient(params);
        String sessionKey = params.getString("sessionKey");
        client.setSessionKey(sessionKey.getBytes());
        return Boolean.TRUE;
    }

    @Override
    public String getName() {
        return EzyMethodNames.METHOD_SET_SESSION_KEY;
    }
}
