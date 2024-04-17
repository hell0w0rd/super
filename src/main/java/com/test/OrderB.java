package com.test;

import com.Supermarket;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author lumeng
 */
public class OrderB {
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
        System.out.println(supermarket.getMoney(goods));
    }
}
