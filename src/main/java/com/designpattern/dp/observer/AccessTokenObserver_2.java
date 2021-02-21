package com.designpattern.dp.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * access_token变更的观察者1
 */
public class AccessTokenObserver_2 implements Observer {

    // 单例
    private static final AccessTokenObserver_2 INSTANCE = new AccessTokenObserver_2();

    public static Observer getInstance() {
        return INSTANCE;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (!(o instanceof AccessToken)) {
            return;
        }
        AccessToken accessToken = (AccessToken) o;
        System.out.println("观察者 AccessTokenObserver_2 接收到变化:" + accessToken.accessToken);
    }
}
