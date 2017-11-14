package demo.extend.access;

/* 
ООП - машинки
*/

import static demo.extend.access.ExtendMethodAccessDemo.Constants.FERRARI_NAME;
import static demo.extend.access.ExtendMethodAccessDemo.Constants.LANOS_NAME;
import static demo.extend.access.ExtendMethodAccessDemo.Constants.LUXURIOUS_CAR;

public class ExtendMethodAccessDemo {
    public static void main(String[] args) {
        new ExtendMethodAccessDemo.LuxuriousCar().printlnDesire();
        new ExtendMethodAccessDemo.CheapCar().printlnDesire();
        new ExtendMethodAccessDemo.Ferrari().printlnDesire();
        new ExtendMethodAccessDemo.Lanos().printlnDesire();
    }

    public static class Ferrari extends LuxuriousCar {
        @Override
        public void printlnDesire() {
            System.out.println(ExtendMethodAccessDemo.Constants.WANT_STRING + FERRARI_NAME);
        }
    }

    public static class Lanos extends CheapCar {
        @Override
        public void printlnDesire() {
            System.out.println(ExtendMethodAccessDemo.Constants.WANT_STRING + LANOS_NAME);
        }
    }

    public static class LuxuriousCar {
        protected void printlnDesire() {
            System.out.println(ExtendMethodAccessDemo.Constants.WANT_STRING + LUXURIOUS_CAR);
        }
    }

    public static class CheapCar {
        protected void printlnDesire() {
            System.out.println(ExtendMethodAccessDemo.Constants.WANT_STRING + ExtendMethodAccessDemo.Constants.CHEAP_CAR);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }
}
