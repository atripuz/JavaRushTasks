package demo.initialize.staticblock;

import java.util.HashMap;
import java.util.Map;

/* 
Статики 1
*/

public class StaticBlockDemo {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1d, "a");
        labels.put(2d, "b");
        labels.put(3d, "c");
        labels.put(4d, "e");
        labels.put(5d, "f");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
