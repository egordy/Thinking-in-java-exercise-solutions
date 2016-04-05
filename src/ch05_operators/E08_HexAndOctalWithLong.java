package ch05_operators;

public class E08_HexAndOctalWithLong {
    static int hexademical = 0x2f;
    static int octal = 0171;


    public static void main(String[] args) {
        System.out.println("hexademical = " + Integer.toBinaryString(hexademical));
        System.out.println("hexademical = " + Long.toBinaryString(hexademical));
        System.out.println("octal = " + Integer.toBinaryString(octal));
        System.out.println("octal = " + Long.toBinaryString(octal));
    }


}
