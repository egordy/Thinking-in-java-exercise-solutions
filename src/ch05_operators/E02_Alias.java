package ch05_operators;

public class E02_Alias {
    float petrol;

    public static void main(String[] args) {
        E02_Alias andrei = new E02_Alias();
        E02_Alias lena = new E02_Alias();
        andrei.petrol = 40f;
        lena.petrol = 5f;
        System.out.println("Andrei: petrol " + andrei.petrol);
        System.out.println("Lena: petrol " + lena.petrol);
        andrei = lena;
        System.out.println("Andrei: petrol " + andrei.petrol);
        System.out.println("Lena: petrol " + lena.petrol);
    }
}

