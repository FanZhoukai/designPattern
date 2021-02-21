package com.designpattern.dp.strategy.impl;

import com.designpattern.dp.strategy.Strategy;
import com.designpattern.dp.strategy.StrategyEnum;
import org.springframework.stereotype.Component;

@Component
public class Strategy_1_Impl implements Strategy {
    @Override
    public String process() {
        System.out.println("processing Strategy_1...");
        return "Strategy_1_Impl";
    }

    @Override
    public String support() {
        return StrategyEnum.STRATEGY_1.name();
    }
}
