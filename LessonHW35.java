public class LessonHW35 {

    public static void main(String[] args) {
        System.out.println("Домашнее ззадание 5");
        System.out.println(isSumInRange(5, 6));  // true
        System.out.println(isSumInRange(15, 10)); // false
        System.out.println(isSumInRange(10, 10)); // true
        System.out.println(isSumInRange(3, 8));   // false
    }
    public static boolean isSumInRange(int a2, int b2) {
        int sum = a2 + b2;
        return sum >= 10 && sum <= 20;
    }
}
