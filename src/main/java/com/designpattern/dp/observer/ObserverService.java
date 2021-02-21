package com.designpattern.dp.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 观察者模式
 */
@Component
public class ObserverService {

    @Autowired
    private AccessToken accessToken;

    public void process(String token) {
        accessToken.setAccessToken(token);
    }

}
