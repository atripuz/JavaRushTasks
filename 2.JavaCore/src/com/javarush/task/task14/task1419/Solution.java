package com.javarush.task.task14.task1419;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            int[] intsArray = new int[10];
            int nonExistingArrayElement = intsArray[11];

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String string = "";
            String newString = String.valueOf(string.charAt(1));

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String string = null;
            String newString = string.toLowerCase();

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("SomeFile"));
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IOException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String string = (String) new Object();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new FileNotFoundException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new RuntimeException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NumberFormatException();
        } catch (Exception e) {
            exceptions.add(e);
        }


    }
}
