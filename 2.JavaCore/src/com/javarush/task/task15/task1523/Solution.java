package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {

    String string;
    int anInt;

    public Solution() {
    }

    private Solution(String string) {
        this.string = string;
    }

    Solution(int anInt) {
        this.anInt = anInt;
    }

    protected Solution(String string, int anInt) {
        this.string = string;
        this.anInt = anInt;
    }

    public static void main(String[] args) {

    }
}

