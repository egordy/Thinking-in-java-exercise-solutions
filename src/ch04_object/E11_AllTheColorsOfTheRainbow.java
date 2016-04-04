package ch04_object;

public class E11_AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;

    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }

    public void paintTheSkyWithCurrentColor() {
        System.out.println("The Sky is now " + anIntegerRepresentingColors);
    }

    public static void main(String[] args) {
        E11_AllTheColorsOfTheRainbow colors = new E11_AllTheColorsOfTheRainbow();
        colors.changeTheHueOfTheColor(7);
        colors.paintTheSkyWithCurrentColor();
    }
}
