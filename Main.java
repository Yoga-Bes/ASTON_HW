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
            System.out.println("Сумма correctArray: " + SumArray.sumArray(correctArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма wrongSizeArray: " + SumArray.sumArray(wrongSizeArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма wrongDataArray: " + SumArray.sumArray(wrongDataArray));
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
}