import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //Product
        Product[] productsArray = new Product[5];
        productsArray [0] = new Product("Samsung S25 Ultra", LocalDate.of(2025, 2, 1), "Samsung Corp.", "Korea", 5599, true);
        productsArray [1] = new Product("Samsung S24 Ultra", LocalDate.of(2024, 2, 1), "Samsung Corp.", "Korea", 5099, true);
        productsArray [2] = new Product("Samsung S23 Ultra", LocalDate.of(2023, 2, 1), "Samsung Corp.", "Korea", 4599, true);
        productsArray [3] = new Product("Samsung S22 Ultra", LocalDate.of(2022, 2, 1), "Samsung Corp.", "Korea", 4099, false);
        productsArray [4] = new Product("Samsung S21 Ultra", LocalDate.of(2021, 2, 1), "Samsung Corp.", "Korea", 3099, false);
        for (Product product : productsArray) {
            System.out.println(product);
        }

        //Park
        Park park = new Park("Веселый мир");
        park.addAttraction("Колесо обозрения", "10:00 - 22:00", 300);
        park.addAttraction("Американские горки", "11:00 - 20:00", 500);
        park.addAttraction("Карусель", "09:00 - 18:00", 200);
        park.snowAttractions();
    }
}