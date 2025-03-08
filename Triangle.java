public class Triangle implements Shape {

    private double sidA;

    private double sidB;

    private double sidC;

    private String fillColor;

    private String borderColor;

    public Triangle(double sidA, double sidB, double sidC, String fillColor, String borderColor) {
        if (sidA <= 0 || sidB <= 0 || sidC <= 0) {
            throw new IllegalArgumentException("Стороны треуголька должны быть положительными числами.");
        }
        if (!isValidTriangle(sidA, sidB, sidC)) {
            throw new IllegalArgumentException("Стороны не могут образовать треугольник.");
        }
        this.sidA = sidA;
        this.sidB = sidB;
        this.sidC = sidC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public double getSidA() {
        return sidA;
    }

    public double getSidB() {
        return sidB;
    }

    public double getSidC() {
        return sidC;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}
