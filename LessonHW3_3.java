public class LessonHW3_3 {

    public static void printColor() {
        System.out.println("Домашнее задание 3");
        double value = 50.0;
        if (value <= 0.10) {
            System.out.println("Красный");
        } else if (value > 0.10 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100 && value < 1100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Значение вне диапазона");
        }
    }
}
