package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws Exception {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            BigInteger a = BigInteger.valueOf(Long.parseLong(reader.readLine()));
            BigInteger b = BigInteger.valueOf(Long.parseLong(reader.readLine()));

            if (a.intValue() <= 0 || b.intValue() <= 0) {
                throw new RuntimeException("a or b are not positive");
            }

            BigInteger gcd = a.gcd(b);
            System.out.println(gcd);

        } catch (NumberFormatException e) {
            throw new RuntimeException("a or b are not big integers");
        }
    }
}
