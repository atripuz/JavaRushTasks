package com.javarush.task.task15.task1529;

/**
 * Created by Aliaksei_Tripuz on 10/12/2017.
 */
public class Plane implements Flyable {

    private int passengersCount;

    public Plane(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    @Override
    public void fly() {

    }
}
