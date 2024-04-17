package com.Factory;

import com.StrategyType;
import com.strategy.DiscountStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 超市活动工厂模式
 * @author lumeng
 */
public class StrategyFactory {
    private final static Map<String, DiscountStrategy> STRATEGY = new HashMap<>();

    static {
        for (StrategyType strategy : StrategyType.values()) {
            STRATEGY.put(strategy.getStrategyName(), strategy.getStrategyObject());
        }
    }

    public static Object doStrategy(String key, Object context) {
        DiscountStrategy discountStrategy = STRATEGY.get(key);
        if (discountStrategy != null) {
            return discountStrategy.discount(context);
        }
        return context;
    }
}
