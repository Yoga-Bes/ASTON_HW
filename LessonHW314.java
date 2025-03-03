import java.util.Arrays;

public class LessonHW314 {

    public static void main(String[] args) {
        System.out.println("Домашнее задание 14");
        int[] resultArray = createFilledArray(5, 42);
        System.out.println(Arrays.toString(resultArray));
    }
    public static int[] createFilledArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue); // Заполняем массив значением initialValue
        return array;
    }
}

