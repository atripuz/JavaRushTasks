package com.javarush.task.task14.task1413;

/**
 * Created by Aliaksei_Tripuz on 3/9/2017.
 */
public class Mouse implements CompItem {
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
