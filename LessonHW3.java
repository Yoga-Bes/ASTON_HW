import java.util.Arrays;

public class LessonHW3 {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkNumberSign(5);
        checkNumberSign(-3);
        checkNumberSign(0);
    }

    public static void printThreeWords() {
        System.out.println("Домашнее задание 1");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        System.out.println("Домашнее задание 2");
        int a = 5;
        int b = -3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

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

    public static void compareNumbers() {
        System.out.println("Домашнее задание 4");
        int a1 = 7;
        int b1 = 5;

        if (a1 >= b1) {
            System.out.println("a1 >= b1");
        } else {
            System.out.println("a1 < b1");
        }
        System.out.println("Домашнее задание 6");
    }

    public static void checkNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
}