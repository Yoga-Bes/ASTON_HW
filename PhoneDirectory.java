import java.util.*;

public class PhoneDirectory {

    private final Map<String, Set<String>> directory;

    public PhoneDirectory() {
        this.directory = new HashMap<>();
    }

    public void add(String lastName, String phoneName) {
        directory.computeIfAbsent(lastName, k -> new HashSet<>()).add(phoneName);
    }

    public Set<String> get(String lastName) {
        return directory.getOrDefault(lastName, Collections.emptySet());
    }

    public void printDirectory() {
        directory.forEach((lastName, phones) -> {
            System.out.println(lastName + ":");
            phones.forEach(phone -> System.out.println(" - " + phone));
        });
    }
}
