package com.javarush.task.task14.task1417;

/**
 * Created by Aliaksei_Tripuz on 3/14/2017.
 */
public class Ruble extends Money {
    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
