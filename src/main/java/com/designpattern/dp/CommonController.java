package com.designpattern.dp;

import com.designpattern.dp.observer.ObserverService;
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
    @Autowired
    private ObserverService observerService;

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

    /**
     * 观察者模式
     * 测试URL：http://127.0.0.1:8080/observer?accessToken=abc
     * 预期结果：所有已注册的观察者，都会接到变化的通知
     */
    @RequestMapping("observer")
    public String observer(String accessToken) {
        observerService.process(accessToken);
        return "请观察日志...";
    }
}
