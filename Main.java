import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String[][] correctArray = {
                {"1", "3", "5", "7"},
                {"2", "4", "6", "8"},
                {"1", "2", "3", "4"},
                {"9", "8", "7", "6"}
        };

        String[][] wrongSizeArray = {
                {"1", "3", "5"},
                {"2", "4", "6"}
        };

        String[][] wrongDataArray = {
                {"1", "3", "5", "7"},
                {"2", "4", "6", "8"},
                {"1", "2", "3", "4"},
                {"9", "p", "7", "6"}
        };

        try {
            System.out.println("Сумма correctArray: " + sumArray(correctArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма wrongSizeArray: " + sumArray(wrongSizeArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма wrongDataArray: " + sumArray(wrongDataArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            int[] arr = new int[4];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Поймано ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException(" Неверный размер массива. Ожидается 4х4! ");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(" Неверные данные в ячейке [" + i + "][" + j + "]", i, j);
                }
            }
        }

        return sum;
    }
}