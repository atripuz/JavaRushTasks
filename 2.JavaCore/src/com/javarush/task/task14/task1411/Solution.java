package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        ArrayList<String> expectedKeys = new ArrayList<>();
        Collections.addAll(expectedKeys, "user", "loser", "coder", "proger");
        ArrayList<String> keys = new ArrayList<>();
        boolean action = true;

        while (action) {
            key = reader.readLine();
            if (!expectedKeys.contains(key)) {
                action = false;
            } else {
                keys.add(key);
            }
        }

        for (String keyString : keys) {
            //создаем объект, пункт 2
            if (keyString.equals(expectedKeys.get(0))) {
                person = new Person.User();
            } else if (keyString.equals(expectedKeys.get(1))) {
                person = new Person.Loser();
            } else if (keyString.equals(expectedKeys.get(2))) {
                person = new Person.Coder();
            } else if (keyString.equals(expectedKeys.get(3))) {
                person = new Person.Proger();
            }
            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).coding();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
