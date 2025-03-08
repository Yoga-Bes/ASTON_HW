public class LessonHW3_7 {

    public static Object toNegative(int number) {
        if (number < 0) {
            return number; // вернем число, если оно отрицательное
        } else {
            return false; // вернем false, если положительное или ноль
        }
    }
}
