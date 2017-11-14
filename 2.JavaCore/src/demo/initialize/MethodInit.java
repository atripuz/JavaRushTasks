package demo.initialize;

public class MethodInit {
    int i = f();
    int j = g(i);

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }

    @Override
    public String toString() {
        return "MethodInit{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new MethodInit().toString());
    }
}
