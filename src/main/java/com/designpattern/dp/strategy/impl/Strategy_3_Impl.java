package com.designpattern.dp.strategy.impl;

import com.designpattern.dp.strategy.Strategy;
import com.designpattern.dp.strategy.StrategyEnum;
import org.springframework.stereotype.Component;

@Component
public class Strategy_3_Impl implements Strategy {
    @Override
    public String process() {
        System.out.println("processing Strategy_3...");
        return "Strategy_3_Impl";
    }

    @Override
    public String support() {
        return StrategyEnum.STRATEGY_3.name();
    }
}
