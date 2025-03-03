import java.util.Arrays;

public class Lesson3_HW1 {

    HW1

    public static void main(String[] args) {
        printThreeWords();
    }

        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

     HW2
        public static void main(String[] args) {
            checkSumSign();
        }

        public static void checkSumSign() {
            int a = 5;
            int b = -3;

            int sum = a + b;

            if (sum >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }

    HW3
    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        double value = 50.0;

        if (value <= 0.10) {
            System.out.println("Красный");
        } else if (value > 0.10 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100 && value < 1100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Значение вне диапазона");
        }
    }

    HW4
    public static void main(String[] args) {
        compareNumbers();
    }

    public static void compareNumbers() {
        int a = 7;
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    HW5
    public static void main(String[] args) {
        // Примеры использования метода
        System.out.println(isSumInRange(5, 6));  // true
        System.out.println(isSumInRange(15, 10)); // false
        System.out.println(isSumInRange(10, 10)); // true
        System.out.println(isSumInRange(3, 8));   // false
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

     HW6
    public static void main(String[] args) {
        checkNumberSign(5);
        checkNumberSign(-3);
        checkNumberSign(0);
    }

    public static void checkNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    HW7
    public static void main(String[] args) {
        System.out.println(toNegative(-5)); // -5
        System.out.println(toNegative(3));   // false
        System.out.println(toNegative(0));   // false
    }

    public static Object toNegative(int number) {
        if (number < 0) {
            return number; // вернем число, если оно отрицательное
        } else {
            return false; // вернем false, если положительное или ноль
        }
    }

        HW8
    public static void main(String[] args) {
        printString("Привет", 3);
        printString("Hello", 5);
    }

    public static void printString(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

    HW9
    public static void main(String[] args) {
        System.out.println(isLeapYear(2020)); // true
        System.out.println(isLeapYear(1900)); // false
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(2021)); // false
    }

    public static boolean isLeapYear(int year) {
        // Условия для определения високосного года
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    HW10
    public static void main(String[] args) {
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

  HW11
public static void main(String[] args) {

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

    HW12
public static void main(String[] args) {

    int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] < 6) {
            numbers[i] *= 2;
        }
    }
    System.out.println("Измененный массив:");
    printArray(numbers);
}
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    HW13
public static void main(String[] args) {
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

    HW14
public static void main(String[] args) {
    int[] resultArray = createFilledArray(5, 42);
    System.out.println(Arrays.toString(resultArray));
}

    public static int[] createFilledArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue); // Заполняем массив значением initialValue
        return array;
    }
}