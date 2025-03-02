public class Main {

    public static void main(String[] args) {
        try {
            Circle circle = new Circle(5, "Красный", "Черный");
            Rectangle rectangle = new Rectangle(4, 6, "Синий", "Белый");
            Triangle triangle = new Triangle(3, 4, 5, "Зеленый", "Желтый");

            printShapeInfo(circle);
            printShapeInfo(rectangle);
            printShapeInfo(triangle);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
        public static void printShapeInfo(Shape shape) {
            System.out.println("Площадь: " + shape.calculateArea());
            System.out.println("Периметр: " + shape.calculatePerimeter());
            System.out.println("Цвет заливки: " + shape.getFillColor());
            System.out.println("Цвет границ: " + shape.getBorderColor());
            System.out.println("--------------------------------------");
        }
    }


