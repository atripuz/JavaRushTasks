package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread(new InfiniteThread()));
        threads.add(new Thread(new InterruptedExceptionThread()));
        threads.add(new Thread(new UraThread()));
        threads.add(new ShowWarningThread());
        threads.add(new Thread(new CountNumbersThread()));
    }

    public static void main(String[] args) {
    }

    static class InfiniteThread implements Runnable {

        @Override
        public void run() {
            for (; ; ) {
            }
        }
    }

    static class InterruptedExceptionThread implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    static class UraThread implements Runnable {

        @Override
        public void run() {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class ShowWarningThread extends Thread implements Message {

        private boolean isAlive = true;

        @Override
        public void run() {
            while (isAlive) {

            }
        }

        @Override
        public void showWarning() {
            isAlive = false;
        }
    }

    static class CountNumbersThread implements Runnable {

        int sum;

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String string;
                while (!(string = reader.readLine()).equals("N")) {
                    sum += Integer.parseInt(string);
                }
                reader.close();
                System.out.println(sum);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}