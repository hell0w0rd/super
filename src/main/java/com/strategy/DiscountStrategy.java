package com.strategy;

/**
 * 活动-策略模式
 * @author lumeng
 */
public interface DiscountStrategy {

    /**
     * 活动
     * @param context
     * @return Object
     */
    Object discount(Object context);

}

