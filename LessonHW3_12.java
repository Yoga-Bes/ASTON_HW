import java.util.Arrays;

public class LessonHW3_12 {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println("Измененный массив:" + Arrays.toString(array));
    }
}
