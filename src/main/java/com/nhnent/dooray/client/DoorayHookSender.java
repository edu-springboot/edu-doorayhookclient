package com.nhnent.dooray.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * DoorayHook을 이용해서 HookUrl 에 요청을 전송하는 객체이다.
 * DoorayHookを利用してHookUrlに要請を伝送するオブジェクトである。
 */
public class DoorayHookSender {

    private RestTemplate resttemplate;

    private String url;

    public DoorayHookSender(RestTemplate resttemplate, String url) {
        this.resttemplate = resttemplate;
        this.url = url;
    }

    public void send(DoorayHook doorayHook) {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<DoorayHook> entity = new HttpEntity<DoorayHook>(doorayHook, headers);
        ResponseEntity<String> exchange = resttemplate.exchange(url, HttpMethod.POST, entity, String.class);
    }

}
