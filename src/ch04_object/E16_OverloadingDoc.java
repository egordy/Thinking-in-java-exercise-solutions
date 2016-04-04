package ch04_object;

/**
 * Simple test code for E16_OverloadJavaDoc class
 */
public class E16_OverloadingDoc {
    /**
     * Creates <b>E16_OverloadJavaDoc</b> objects and exercises the two
     * different <code>info()</code> methods.
     *
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            E16_OverloadJavaDoc t = new E16_OverloadJavaDoc(i);
            t.info();
            t.info("overloaded method");
        }
/**  Overloaded constructor: */
        new E16_OverloadJavaDoc();
    }
} /* Output:
Creating new E16_OverloadJavaDoc that is 0 feet tall
E16_OverloadJavaDoc is 0 feet tall
overloaded method: E16_OverloadJavaDoc is 0 feet tall
Creating new E16_OverloadJavaDoc that is 1 feet tall
E16_OverloadJavaDoc is 1 feet tall
overloaded method: E16_OverloadJavaDoc is 1 feet tall
Creating new E16_OverloadJavaDoc that is 2 feet tall
E16_OverloadJavaDoc is 2 feet tall
overloaded method: E16_OverloadJavaDoc is 2 feet tall
Creating new E16_OverloadJavaDoc that is 3 feet tall
E16_OverloadJavaDoc is 3 feet tall
overloaded method: E16_OverloadJavaDoc is 3 feet tall
Creating new E16_OverloadJavaDoc that is 4 feet tall
E16_OverloadJavaDoc is 4 feet tall
overloaded method: E16_OverloadJavaDoc is 4 feet tall
Planting a seedling
*///:~
