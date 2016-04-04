package ch04_object;

public class E04_05_DataOnly {
    int i;
    double d;
    boolean b;

    public static void main(String[] args) {
        E04_05_DataOnly data = new E04_05_DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);
    }
}


