public class LessonHW310 {

    public static void main(String[] args) {
        System.out.println("Домашнее ззадание 10");
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println("Исходный массив:");
        printArray(binaryArray);
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 0) {
                binaryArray[i] = 1; // Замена 0 на 1
            } else {
                binaryArray[i] = 0; // Замена 1 на 0
            }
        }
        System.out.println("Измененный массив:");
        printArray(binaryArray);
    }
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
