package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {

    int intVar;
    double doubleVar;
    Double DoubleVar;
    boolean booleanVar;
    Object ObjectVar;
    Exception ExceptionVar;
    String StringVar;


    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.print(
                solution.intVar +
                        "\n" + solution.doubleVar +
                        "\n" + solution.DoubleVar +
                        "\n" + solution.booleanVar +
                        "\n" + solution.ObjectVar +
                        "\n" + solution.ExceptionVar +
                        "\n" + solution.StringVar +
                        "\n");
    }
}
