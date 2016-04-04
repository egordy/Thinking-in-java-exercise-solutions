package ch04_object;

public class E08_Static {
    private static int i=1;

    public static void main(String[] args) {
        E08_Static first = new E08_Static();
        E08_Static second = new E08_Static();
        E08_Static third = new E08_Static();
        third.i = 2;

        System.out.println(first.i);
    }

}
