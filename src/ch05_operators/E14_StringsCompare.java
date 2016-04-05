package ch05_operators;

/**
 * Exercise 14: (3) Write a method that takes two String arguments and uses all the
 * boolean comparisons to compare the two Strings and print the results. For the == and !=,
 * also perform the equals( ) test. In main( ), call your method with some different String
 * objects
 */
public class E14_StringsCompare {
    static void CompareStrings(String s1, String s2) {
        //System.out.println("s1>s2? = "+ s1>=s2);
        //System.out.println("s1<s2? = " + s1<=s2);
        System.out.println("s1==s2? = " + s1 == s2);
        System.out.println("s1!=s2? = " + s1 != s2);
        System.out.println("s1.eq s2? = " + s1.equals(s2));

    }

    public static void main(String[] args) {
        CompareStrings("aaaa", "aaa");
        CompareStrings("aaaa", "aaaa");

    }
}
