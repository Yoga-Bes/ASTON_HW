import java.util.Arrays;

public class LessonHW3_14 {

    public static int[] createFilledArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue); // Заполняем массив значением initialValue
        return array;
    }
}

