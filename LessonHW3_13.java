import java.util.Arrays;

public class LessonHW3_13 {

    public static void printMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int[] row : matrix) {
            for (int i = 0; i < n; i++) {
                matrix[i][i] = 1;
            }
            System.out.println(Arrays.toString(row) + " ");
        }
    }
}
