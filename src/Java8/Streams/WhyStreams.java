package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class WhyStreams {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("David");
        names.add("Johnson");
        names.add("Aakash");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("John");
        names.add("Aditya");
        names.add("abcdefg");
        names.add("pqrstuv");
        names.add("jklmnop");
        names.add("abc");
        names.add("Abhishek");

        System.out.println(" ===================== full list =================");
        names.stream().forEach(System.out::println);
        System.out.println(" ===================== limit 5 =================");
        names.stream().limit(5).forEach(System.out::println);
        System.out.println(" ===================== skip 5 =================");
        names.stream().skip(5).forEach(System.out::println);

        //Collection print all elements whose length more than 5

//        System.out.println("=============== using collection methods =================");
//        for (String element : names){
//            if (element.length()>=5 && element.startsWith("A"))
//                System.out.println(" Elements whose length greater than 5 name starts with A : "+element.toUpperCase());
//        }
//        System.out.println("=============== using stream api =================");
//
//        // a source, one or more intermediate operations and a terminal operation
//        names.stream().
//                filter( s -> s.length() >=5 && s.startsWith("A")).
//                map(str -> str.toUpperCase()).
//                forEach( element -> System.out.println(" Elements whose length greater than 5 and name starts with A : "+element));

        System.out.println("============ using IntStream.of() method ====================");

        IntStream.of(new int[] {4,7,3,2,5,1,18,15,13,7,8,15,5,21,18}).
                filter(i -> i>5).
                distinct().
                sorted().
                forEach(element ->System.out.println("Elements number more than 5 : "+element ));

    }
}
