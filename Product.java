import java.util.Calendar;

public class Product {


    private String name;
    private int productionDate;
    private String manufacturer;
    private String country;
    private double price;
    private String bookingStatus;
    public Product() {

        name = "Стакан";
        productionDate = 2002;
        manufacturer = "IKEA";
        country = "USA";
        price = 1.5;
        bookingStatus = "В продаже";
        System.out.println("Имя товара: " + name + "; Год производства: " + productionDate + "; Производитель: " + manufacturer + "; Страна производитель: " + country + "; Цена: " + price + "; Состояние бронирования" + bookingStatus);


}

}
