package com.test;

import com.Supermarket;
import com.Factory.StrategyFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author lumeng
 */
public class OrderD {
    public static void main(String[] args) {
        Map<String, Integer> goods = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.print("苹果斤数:");
        int appleWeight = input.nextInt();
        System.out.print("草莓斤数:");
        int strawberryWeight = input.nextInt();
        System.out.print("芒果斤数:");
        int mangoWeight = input.nextInt();
        goods.put("apple",appleWeight);
        goods.put("strawberry",strawberryWeight);
        goods.put("mango",mangoWeight);

        Supermarket supermarket = new Supermarket();
        double sum = supermarket.getMoney(goods);
        //活动满减，名称
        String act = "fullDiscount";
        sum = (double) StrategyFactory.doStrategy(act,sum);
        System.out.println(sum);
    }
}
