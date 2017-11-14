package com.javarush.task.task15.task1506;

/* 
Что-то лишнее
*/

public class Solution {
    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }

    //Case 4 matches
    public static void print(Integer i) {
        System.out.println("Это Integer");
    }

/*    public static void print(int i) {
        System.out.println("Это Integer");
    }*/

 /*   public static void print(Short i) {
        System.out.println("Это Object");
    }*/

    //Case 2 matches
    public static void print(Object i) {
        System.out.println("Это Object");
    }

    //Cases 1, 3, 5 match
    public static void print(double i) {
        System.out.println("Это double");
    }

/*    public static void print(Double i) {
        System.out.println("Это double");
    }*/

/*    public static void print(float i) {
        System.out.println("Это Double");
    }*/
}
