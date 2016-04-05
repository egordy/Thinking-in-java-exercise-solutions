package ch05_operators;

import static java.lang.Math.random;

public class E07_CoinFlipper {
    static boolean orel = false;
    static boolean reshka = false;

    public static boolean isOrel() {
        int i = (int) Math.floor(random() * 10);
        int j = (int) Math.floor(random() * 10);
        System.out.println(i);
        System.out.println(j);
        orel = i > j;
        return orel;
    }

    public static boolean isReshka() {
        reshka = !orel;
        return reshka;
    }

    public static void main(String[] args) {
        System.out.println("Orel? = " + isOrel());
        System.out.println("Reshka? = " + isReshka());
    }
}