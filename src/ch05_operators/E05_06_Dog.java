package ch05_operators;

public class E05_06_Dog {
    String name;
    String says;

    public static void main(String[] args) {
        E05_06_Dog spot = new E05_06_Dog();
        spot.says = "Ruff!";
        spot.name = "Spot";
        E05_06_Dog scruffy = new E05_06_Dog();
        scruffy.says = "Wurf!";
        scruffy.name = "Scruffy";
        System.out.println(spot.name + " says " + spot.says);
        System.out.println(scruffy.name + " says " + scruffy.says);
        E05_06_Dog sharik = new E05_06_Dog();
        sharik = spot;
        System.out.println(sharik.equals(spot));
        System.out.println(sharik == spot);
        System.out.println(sharik.name + " says " + sharik.says);

    }
}