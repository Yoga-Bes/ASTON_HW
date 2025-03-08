import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1
        LessonHW3_1.printThreeWords();

        //Task 2
        LessonHW3_2.checkSumSign();

        //Task 3
        LessonHW3_3.printColor();

        //Task 4
        LessonHW3_4.compareNumbers();

        //Task 5
        System.out.println("Домашнее ззадание 5");
        System.out.println(LessonHW3_5.isSumInRange(5, 6));  // true
        System.out.println(LessonHW3_5.isSumInRange(15, 10)); // false
        System.out.println(LessonHW3_5.isSumInRange(10, 10)); // true
        System.out.println(LessonHW3_5.isSumInRange(3, 8));   // false

        //Task 6
        System.out.println("Домашнее ззадание 6");
        LessonHW3_6.checkNumberSign(5);
        LessonHW3_6.checkNumberSign(-3);
        LessonHW3_6.checkNumberSign(0);

        //Task 7
        System.out.println("Домашнее задание 7");
        System.out.println(LessonHW3_7.toNegative(-5)); // -5
        System.out.println(LessonHW3_7.toNegative(3));   // false
        System.out.println(LessonHW3_7.toNegative(0));   // false

        //Task 8
        System.out.println("Домашнее ззадание 8");
        LessonHW3_8.printString("Привет", 3);
        LessonHW3_8.printString("Hello", 5);

        //Task 9
        System.out.println("Домашнее ззадание 9");
        System.out.println(LessonHW3_9.isLeapYear(2020)); // true
        System.out.println(LessonHW3_9.isLeapYear(1900)); // false
        System.out.println(LessonHW3_9.isLeapYear(2000)); // true
        System.out.println(LessonHW3_9.isLeapYear(2021)); // false

        //Task 10
        System.out.println("Домашнее ззадание 10");
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        LessonHW3_10.printArray(binaryArray);

        //Task 11
        System.out.println("Домашнее ззадание 11");
        int[] numbers_one = new int[100];
        LessonHW3_11.printArray(numbers_one);

        //Task 12
        System.out.println("Домашнее задание 12");
        int[] numbers_two = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        LessonHW3_12.printArray(numbers_two);

        //Task 13
        System.out.println("Домашнее задание 13");
        int n = 5;
        LessonHW3_13.printMatrix(n);

        //Task 14
        System.out.println("Домашнее задание 14");
        int[] resultArray = LessonHW3_14.createFilledArray(5, 42);
        System.out.println(Arrays.toString(resultArray));
    }
}