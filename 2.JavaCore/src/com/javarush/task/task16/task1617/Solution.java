package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            int initCountSeconds = countSeconds;
            try {
                if (initCountSeconds < 3.5) {
                    while (!Thread.currentThread().isInterrupted()) {
                        Thread.sleep(1000);
                        System.out.print(countSeconds + " ");
                        countSeconds--;
                    }
                }
                if (initCountSeconds >= 3.5) {
                    while (!Thread.currentThread().isInterrupted()) {
                        System.out.print(countSeconds + " ");
                        countSeconds--;
                        Thread.sleep(1000);
                    }
                }
            } catch (InterruptedException e) {
                if (initCountSeconds < 3.5) {
                    System.out.print("Марш!");
                }
                if (initCountSeconds >= 3.5) {
                    System.out.print("Прервано!");
                }
            }
        }
    }
}
