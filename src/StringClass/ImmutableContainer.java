package StringClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 1. Declare the class as final
public final class ImmutableContainer<T> {

    // 2. Private and final fields
    private final String id;
    private final List<T> items;

    // 3. Constructor to initialize fields
    public ImmutableContainer(String id, List<T> items) {
        this.id = id;
        // 4. Defensive copy for mutable objects (List)
        this.items = new ArrayList<>(items);
    }

    // 5. Getter only (no setters)
    public String getId() {
        return id;
    }

    // 6. Return unmodifiable view or deep copy for mutable objects
    public List<T> getItems() {
        return Collections.unmodifiableList(items);
    }
}
