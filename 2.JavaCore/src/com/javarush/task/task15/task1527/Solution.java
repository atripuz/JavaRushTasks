package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        String url = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            url = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String urlParams = null;
        try {
            urlParams = url.substring(url.lastIndexOf("?") + 1);
        } catch (NullPointerException e) {
            return;
        }
        char[] chars = urlParams.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        List<String> urlParamsList = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if ("&".equals(String.valueOf(chars[i])) || (i == chars.length - 1)) {
                urlParamsList.add(String.valueOf(stringBuilder));
                stringBuilder = new StringBuilder();
            } else {
                stringBuilder.append(String.valueOf(chars[i]));
            }
        }

        List<String> alertsList = new ArrayList<>();
        for (String string : urlParamsList) {
            if (string.contains("=")) {
                stringBuilder.append(string.substring(0, string.lastIndexOf("="))).append(" ");
            } else {
                stringBuilder.append(string).append(" ");
            }
            if (string.startsWith("obj")) {
                alertsList.add(string.substring(string.lastIndexOf("=") + 1));
            }
        }

        System.out.println(stringBuilder.toString().trim());

        for (String string : alertsList) {
            try {
                alert(Double.valueOf(string));
            } catch (NumberFormatException e) {
                alert(string);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
