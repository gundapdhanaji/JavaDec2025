package Java8.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamMapMethod {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("David");
        names.add("Johnson");
        names.add("Aakash");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("John");
        names.add("Aditya");

        //return length of each name using lambda expression
//        names.stream().
//                map((name -> name.length())).
//                forEach(element -> System.out.println("each element length "+element));

        StreamMapMethod obj = new StreamMapMethod();
        //using normal for loop
        for (String name : names){
            obj.map(name);
        }
    }

    private int map(String name) {
        System.out.println("Length of "+ name + " "+name.length());
        return name.length();
    }
}
