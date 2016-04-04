//: object/E16_OverloadingDoc.java
package ch04_object;
/******************
 * Exercise 16 *****************
 * In the Initialization and Cleanup chapter, add
 * Javadoc documentation to the Overloading.java example.
 * Extract it into an HTML file using Javadoc
 * and view it with your Web browser.
 ************************************************/

/** Model of a single arboreal unit. */
public class E16_OverloadJavaDoc {
    /** Current vertical aspect to the tip. */
    public int height; // 0 by default

    /** Plant a seedling. Assume height can
     *  be considered as zero. */
    public E16_OverloadJavaDoc() {
        System.out.println("Planting a seedling");
    }

    /** Transplant an existing tree with a given height. */
    public E16_OverloadJavaDoc(int i) {
        System.out.println("Creating new E16_OverloadJavaDoc that is "
                + i + " feet tall");
        height = i;
    }

    /** Produce information about this unit. */
    void info() {
        System.out.println("E16_OverloadJavaDoc is " + height + " feet tall");
    }

    /** Produce information with optional message. */
    void info(String s) {
        System.out.println(s + ": E16_OverloadJavaDoc is "
                + height + " feet tall");
    }
}


