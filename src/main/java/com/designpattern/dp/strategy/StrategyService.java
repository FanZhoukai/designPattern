package com.designpattern.dp.strategy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class StrategyService implements ApplicationContextAware {
    // 策略集合
    private Map<String, Strategy> strategyMap = new HashMap<>();

    private ApplicationContext applicationContext;

    @PostConstruct
    private void init() {
        Map<String, Strategy> beansOfType = applicationContext.getBeansOfType(Strategy.class);
        beansOfType.values().forEach(handler -> strategyMap.put(handler.support(), handler));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public String process(String strategy) {
        if (StringUtils.isEmpty(strategy)) {
            return "error";
        }
        Strategy strategyBean = strategyMap.get(strategy);
        if (strategyBean == null) {
            return "error";
        }
        return strategyBean.process();
    }
}
