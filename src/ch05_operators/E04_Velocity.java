package ch05_operators;

public class E04_Velocity {
    static int velocity;

    static int calc(int speed, int time) {
        velocity = speed / time;
        return velocity;
    }

    public static void main(String[] args) {
        System.out.println(calc(6, 1));
    }
}
