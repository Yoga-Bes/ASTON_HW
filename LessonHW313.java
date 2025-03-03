public class LessonHW313 {

    public static void main(String[] args) {
        System.out.println("Домашнее задание 13");
        int n = 5; // Длина стороны массива (количество строк и столбцов)
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
        }
        System.out.println("Квадратный массив с единицами на главной диагонали:");
        printMatrix(matrix);
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
