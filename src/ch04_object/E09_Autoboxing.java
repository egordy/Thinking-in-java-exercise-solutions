package ch04_object;

public class E09_Autoboxing {
    int i = 9;
    Integer igogo = i;

    public static void main(String[] args) {
        E09_Autoboxing box = new E09_Autoboxing();
        System.out.println(box.igogo.doubleValue());
        System.out.println((((Integer) box.i).floatValue()));
    }
}
