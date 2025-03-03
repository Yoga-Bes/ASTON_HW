public class Lesson53Main {

    public static void main(String[] args) {
        Park park = new Park("Веселый мир");

        park.addAttraction("Колесо обозрения", "10:00 - 22:00", 300);
        park.addAttraction("Американские горки", "11:00 - 20:00", 500);
        park.addAttraction("Карусель", "09:00 - 18:00", 200);

        park.snowAttractions();
    }
}

