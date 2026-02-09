package Java8.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamMethods {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("David");
        names.add("Johnson");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("John");

        if (names.stream().anyMatch(name -> name.length() == 5)) {
            System.out.println("Yes... There is a name with 5 letters");
        }

        List<String> allmatch = new ArrayList<>();
        allmatch.add("Sampada");
        allmatch.add("Johnson");
        allmatch.add("Samontika");
        allmatch.add("Brijesh");
        allmatch.add("John");
        if (allmatch.stream().allMatch(name -> name.length() > 5)) {
            System.out.println("All are big names");
        }
        else {
            System.out.println("Not All are big names");
        }
    }

}
