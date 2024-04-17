package com.test;

import com.Supermarket;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author lumeng
 */
public class OrderA {
    public static void main(String[] args) {
        Map<String, Integer> goods = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.print("苹果斤数:");
        int appleWeight = input.nextInt();
        System.out.print("草莓斤数:");
        int strawberryWeight = input.nextInt();
        goods.put("apple",appleWeight);
        goods.put("strawberry",strawberryWeight);

        Supermarket supermarket = new Supermarket();
        System.out.println(supermarket.getMoney(goods));
    }
}
