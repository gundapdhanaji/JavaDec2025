package StringClass;
import java.util.*;

public final class ImmutablePerson { // 1. Class is final
    private final String name;      // 2. Fields are private and final
    private final int age;
    private final Map<String, String> hobbies; // Mutable field

    public ImmutablePerson(String name, int age, Map<String, String> hobbiesList) { // 4. Constructor
        this.name = name;
        this.age = age;

        // 5. Deep copy of mutable list in the constructor
        this.hobbies = new HashMap<>();
        if (hobbiesList != null){
            this.hobbies.putAll(hobbiesList);
        }
    }

    // 3. No setter methods, only getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Map<String, String> getHobbies() {
        // 5. Return a copy for mutable field in the getter
        return new HashMap<>(hobbies);
    }
}

