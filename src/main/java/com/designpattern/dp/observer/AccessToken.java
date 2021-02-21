package com.designpattern.dp.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Objects;
import java.util.Observable;

/**
 * 假设当access_token发生变化时，需要通知各调用方更新本地缓存，
 * 那么可以把access_token包装成一个被观察者（Observable）
 */
@Component
public class AccessToken extends Observable {

    /**
     * 初始化：注册观察者
     */
    @PostConstruct
    private void init() {
        super.addObserver(AccessTokenObserver_1.getInstance());
        super.addObserver(AccessTokenObserver_2.getInstance());
    }


    String accessToken = "";

    public void setAccessToken(String newAccessToken) {
        if (Objects.equals(newAccessToken, this.accessToken)) {
            return;
        }
        this.accessToken = newAccessToken;
        // 若access_token值有修改，则通知全部观察者
        setChanged();
        super.notifyObservers();
    }
}
