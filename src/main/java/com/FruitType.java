package com;

/**
 * 水果种类
 * @author lumeng
 */
public enum FruitType {
    /**
     * 苹果
     */
    APPLE("apple",10,true,0.8),
    /**
     * 草莓
     */
    STRAWBERRY("strawberry",10,false,0),
    /**
     * 芒果
     */
    MANGO("mango",10,false,0);


    private String fruitName;

    private Integer price;

    private boolean isDiscount;

    private double discount;

    FruitType(String fruitName, Integer price, boolean isDiscount, double discount) {
        this.fruitName = fruitName;
        this.price = price;
        this.isDiscount = isDiscount;
        this.discount = discount;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
