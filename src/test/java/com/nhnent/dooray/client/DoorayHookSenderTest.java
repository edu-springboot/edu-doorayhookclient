package com.nhnent.dooray.client;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

/**
 * @author jibumjung
 * @since
 */
public class DoorayHookSenderTest {

    public static final String HOOK_URL = "https://hook.dooray.com/services/1387695619080878080/1996189887212547744/k5xwWNlDSyeSPepE5VwdnQ";

    @Test
    public void sendTest() {
        DoorayHook doorayHook = new DoorayHook();
        doorayHook.setBotName("test");
        doorayHook.setText("test!!");

        DoorayHookSender doorayHookSender = new DoorayHookSender(new RestTemplate(), HOOK_URL);
        doorayHookSender.send(doorayHook);
    }
}