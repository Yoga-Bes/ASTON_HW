public class Attraction {

    private String name;
    private String workingHours;
    private double prise;

    public Attraction(String name, String workingHours, double prise) {
        this.name = name;
        this.workingHours = workingHours;
        this.prise = prise;
    }

    public String toString() {
        return "Аттракцион: " + name + ", Время работы: " + workingHours + ", Стоимость: " + prise + "руб.";
    }
}
