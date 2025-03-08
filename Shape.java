public interface Shape {

    default double calculateArea() {
        if (this instanceof Circle) {
            Circle circle = (Circle) this;
            return Math.PI * Math.pow(circle.getRadius(), 2);
        } else if (this instanceof Rectangle) {
            Rectangle rect = (Rectangle) this;
            return rect.getWidth() * rect.getHeight();
        } else if (this instanceof Triangle) {
            Triangle triangle = (Triangle) this;
            double s = calculatePerimeter() / 2;
            return Math.sqrt(s * (s - triangle.getSidA()) * (s - triangle.getSidB()) * (s - triangle.getSidC()));
        } else {
            throw new UnsupportedOperationException("Неизвестная фигура: " + this.getClass().getName());
        }
    }

    default double calculatePerimeter() {
        if (this instanceof Circle) {
            Circle circle = (Circle) this;
            return 2 * Math.PI * circle.getRadius();
        } else if (this instanceof Rectangle) {
            Rectangle rect = (Rectangle) this;
            return  2 * (rect.getWidth() + rect.getHeight());
        } else if (this instanceof Triangle) {
            Triangle triangle = (Triangle) this;
            return triangle.getSidA() + triangle.getSidB() + triangle.getSidC();
        } else {
            throw new UnsupportedOperationException("Неизвестная фигура: " + this.getClass().getName());
        }
    }

    String getFillColor();

    String getBorderColor();
}