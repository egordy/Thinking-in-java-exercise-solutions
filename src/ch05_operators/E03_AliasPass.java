package ch05_operators;

public class E03_AliasPass {
    float price;

    static void pay(E03_AliasPass toPay) {
        toPay.price = 100f;
    }

    public static void main(String[] args) {
        E03_AliasPass twohundredz = new E03_AliasPass();
        twohundredz.price = 200f;
        System.out.println(twohundredz.price);
        pay(twohundredz);
        System.out.println("After payment: " + twohundredz.price);
    }
}

