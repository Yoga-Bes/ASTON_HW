public class LessonHW311 {

    public static void main(String[] args) {
        System.out.println("Домашнее ззадание 11");
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println("Заполненный массив:");
        printArray(numbers);
    }
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
