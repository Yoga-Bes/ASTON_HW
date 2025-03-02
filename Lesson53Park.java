import java.util.ArrayList;
import java.util.List;

public class Park {

    private String name;
    private List<Attraction> attractions;

    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String workingHours,double prise) {
        Attraction attraction = new Attraction(name, workingHours, prise);
        attractions.add(attraction);
    }

    public void snowAttractions() {
        System.out.println("Аттракционы в парке '" + name + "':");
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }
}
