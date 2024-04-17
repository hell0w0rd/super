package com.strategy.impl;

import com.strategy.DiscountStrategy;

/**
 * 满减
 * @author lumeng
 */
public class FullDiscount implements DiscountStrategy {

    private final static Integer FILL_HUNDRED = 100;

    private final static Integer REDUCE = 10;

    @Override
    public Object discount(Object context) {
        Double price = (double) context;
        if (price > FILL_HUNDRED) {
            price = price - REDUCE;
        }
        return price;
    }
}
