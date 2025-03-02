class Circle implements Shape {

    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть положительным числом.");
        }
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    public String getFillColor() {
        return fillColor;
    }
    public String getBorderColor() {
        return borderColor;
    }
}
