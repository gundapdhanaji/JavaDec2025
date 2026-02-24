package Java8.Streams.Work;

import java.util.stream.Stream;

public class StreamObjectWays {
   public static void main(String[] args) {

        //stream creation ways
       System.out.println("Empty Stream using Stream.empty() method");
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(i-> System.out.println("Creating empty string "+i));

    }
}
