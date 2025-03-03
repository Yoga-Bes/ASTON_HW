public class LessonHW38 {

    public static void main(String[] args) {
        System.out.println("Домашнее ззадание 8");
        printString("Привет", 3);
        printString("Hello", 5);
    }
    public static void printString(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
