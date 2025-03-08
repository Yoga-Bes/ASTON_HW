import java.time.LocalDate;

public class Product {

    private String name;

    private LocalDate releaseDate;

    private String manufacturer;

    private String country;

    private double price;

    private boolean inStock;

    public Product(String name, LocalDate releaseDate,String manufacturer, String country, double price, boolean inStock) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.inStock = inStock;
    }

    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                '}';
    }
}