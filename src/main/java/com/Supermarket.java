package com;

import java.util.HashMap;
import java.util.Map;

/**
 * 超市
 * @author lumeng
 */
public class Supermarket {

    /**
     * 水果价格
     */
    private final static Map<String, Integer> FRUIT_PRICE = new HashMap<>();
    /**
     * 水果折扣
     */
    private final static Map<String, Double> FRUIT_DISCOUNT = new HashMap<>();
    /**
     * 水果是否打折
     */
    private final static Map<String, Boolean> FRUIT_IS_DISCOUNT = new HashMap<>();

    static {
        for (FruitType fruit : FruitType.values()) {
            FRUIT_PRICE.put(fruit.getFruitName(),fruit.getPrice());
            FRUIT_IS_DISCOUNT.put(fruit.getFruitName(),fruit.isDiscount());
            FRUIT_DISCOUNT.put(fruit.getFruitName(),fruit.getDiscount());
        }
    }

    /**
     * 计算金额
     * @param goods
     * @return double
     */
    public double getMoney(Map<String,Integer> goods){
        double sum = 0;
        for (Map.Entry<String, Integer> entry:goods.entrySet()){
            double price = 0;
            if(FRUIT_IS_DISCOUNT.get(entry.getKey())){
                price = FRUIT_PRICE.get(entry.getKey()) * FRUIT_DISCOUNT.get(entry.getKey());
            }else {
                price = FRUIT_PRICE.get(entry.getKey());
            }
            sum = sum + price * entry.getValue();
        }
        return sum;
    }

}
