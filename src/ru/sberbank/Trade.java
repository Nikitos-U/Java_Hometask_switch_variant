package ru.sberbank;

public class Trade {
    private static double price;

    public Trade(double price) {
        this.price = price;
    }

    public static void print() {
        System.out.println(price);
    }
}
