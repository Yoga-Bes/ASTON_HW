import java.util.Arrays;

public class LessonHW3_10 {

    public static void printArray(int[] array) {
        System.out.println("Исходный массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1; // Замена 0 на 1
            } else {
                array[i] = 0; // Замена 1 на 0
            }
        }

        System.out.println("Измененный массив: " + Arrays.toString(array));
    }
}
