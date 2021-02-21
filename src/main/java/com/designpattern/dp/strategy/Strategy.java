package com.designpattern.dp.strategy;

/**
 * 策略接口
 */
public interface Strategy {
    /**
     * 业务方法
     */
    String process();

    /**
     * 支持的策略
     */
    String support();
}
