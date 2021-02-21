package com.designpattern.dp;

import com.designpattern.dp.strategy.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class CommonController {

    @Autowired
    private StrategyService strategyService;

    @RequestMapping("hello")
    public String hello() {
        return "hello world!";
    }

    /**
     * 策略模式
     * 测试URL：http://127.0.0.1:8080/strategy?strategy=STRATEGY_1
     */
    @RequestMapping("strategy")
    public String strategy(String strategy) {
        return strategyService.process(strategy);
    }
}
