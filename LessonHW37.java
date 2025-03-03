public class LessonHW37 {

    public static void main(String[] args) {
        System.out.println("Домашнее задание 7");
        System.out.println(toNegative(-5)); // -5
        System.out.println(toNegative(3));   // false
        System.out.println(toNegative(0));   // false
    }
    public static Object toNegative(int number) {
        if (number < 0) {
            return number; // вернем число, если оно отрицательное
        } else {
            return false; // вернем false, если положительное или ноль
        }
    }
}
