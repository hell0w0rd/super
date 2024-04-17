package com;

import com.strategy.DiscountStrategy;
import com.strategy.impl.FullDiscount;

/**
 * 活动种类
 * @author lumeng
 */

public enum StrategyType {
    /**
     * 满减活动
     */
    FULL_DISCOUNT("fullDiscount",new FullDiscount());

    private String strategyName;

    private DiscountStrategy strategyObject;

    StrategyType(String strategyName, DiscountStrategy strategyObject) {
        this.strategyName = strategyName;
        this.strategyObject = strategyObject;
    }

    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    public DiscountStrategy getStrategyObject() {
        return strategyObject;
    }

    public void setStrategyObject(DiscountStrategy strategyObject) {
        this.strategyObject = strategyObject;
    }
}
