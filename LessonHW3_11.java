import java.util.Arrays;

public class LessonHW3_11 {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Заполненный массив:" + Arrays.toString(array));
    }
}
