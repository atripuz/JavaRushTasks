package demo.initialize;

// Вывод начальных значений, присваиваемых по умолчанию.
public class InitialValues2 {
    boolean t = true;
    char c = 'x';
    byte b = 47;
    short s = 0xff;
    int i = 999;
    long l = 1;
    float f = 3.14f;
    double d = 3.14159;


    void printInitialValues() {
        System.out.println("Data type      Initial value");
        System.out.println("boolean        " + t);
        System.out.println("char           [" + c + "]");
        System.out.println("byte           " + b);
        System.out.println("short          " + s);
        System.out.println("int            " + i);
        System.out.println("long           " + l);
        System.out.println("float          " + f);
        System.out.println("double         " + d);
    }

    public static void main(String[] args) {
        InitialValues2 iv = new InitialValues2();
        iv.printInitialValues();
    /* Тут возможен следующий вариант:
    new InitialValues().printInitialValues();
    */
    }
}
