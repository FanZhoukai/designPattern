package com.designpattern.dp.strategy.impl;

import com.designpattern.dp.strategy.Strategy;
import com.designpattern.dp.strategy.StrategyEnum;
import org.springframework.stereotype.Component;

@Component
public class Strategy_2_Impl implements Strategy {
    @Override
    public String process() {
        System.out.println("processing Strategy_2...");
        return "Strategy_2_Impl";
    }

    @Override
    public String support() {
        return StrategyEnum.STRATEGY_2.name();
    }
}
