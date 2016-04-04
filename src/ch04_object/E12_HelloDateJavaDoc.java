//: object/HelloDate.java
package ch04_object;

import java.util.Date;

/**
 * The first Thinking in Java example program.
 * Displays a string and today's date.
 *
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */
public class E12_HelloDateJavaDoc {
    /**
     * Entry point to class &amp; application.
     *
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
}
/* Output: (55% match)
Hello, it's:
Wed Oct 05 14:39:36 MDT 2005
*///:~

