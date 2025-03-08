public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");

        dog1.run(300);
        dog1.swim(5);
        dog2.run(600);
        dog2.swim(15);

        cat1.run(150);
        cat1.swim(10);
        cat2.run(250);
        cat2.swim(0);

        Bowl bowl = new Bowl(30);
        Cat[] cats = {cat1, cat2};

        for (Cat cat : cats) {
            cat.eat(bowl, 20);
            System.out.println(cat.name + " сыт: " + cat.isFull());
        }

        bowl.addFood(10);
        for (Cat cat : cats) {
            cat.eat(bowl, 20);
            System.out.println(cat.name + " сыт: " + cat.isFull());
        }

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

        System.out.println("--------------------------------------");
        System.out.println("Task 2");
        Circle circle = new Circle(5, "Красный", "Черный");
        Rectangle rectangle = new Rectangle(4, 6, "Синий", "Белый");
        Triangle triangle = new Triangle(3, 4, 5, "Зеленый", "Желтый");

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }

    private static void printShapeInfo(Shape shape) {
        System.out.println(shape.getClass().getName());
        System.out.println("Площадь: " + shape.calculateArea());
        System.out.println("Периметр: " + shape.calculatePerimeter());
        System.out.println("Цвет заливки: " + shape.getFillColor());
        System.out.println("Цвет границ: " + shape.getBorderColor());
        System.out.println("--------------------------------------");
    }
}