import java.util.Arrays;

public class Lesson52 {

    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray [0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray [1] = new Product("Samsung S24 Ultra", "01.02.2024", "Samsung Corp.", "Korea", 5099, true);
        productsArray [2] = new Product("Samsung S23 Ultra", "01.02.2023", "Samsung Corp.", "Korea", 4599, true);
        productsArray [3] = new Product("Samsung S22 Ultra", "01.02.2022", "Samsung Corp.", "Korea", 4099, false);
        productsArray [4] = new Product("Samsung S21 Ultra", "01.02.2021", "Samsung Corp.", "Korea", 3099, false);
        for (Product product : productsArray) {
            System.out.println(product);
        }

    }
}
