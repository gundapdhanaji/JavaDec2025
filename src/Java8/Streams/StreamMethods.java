package Java8.Streams;

import StringClass.StudentShallowCopy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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

        List<String> allmatchref = new ArrayList<>();
        allmatchref.add("Sampada");
        allmatchref.add("Johnson");
        allmatchref.add("Samontika");
        allmatchref.add("Brijesh");
        allmatchref.add("John");
        if (allmatchref.stream().allMatch(name -> name.length() > 5)) {
            System.out.println("All are big names");
        }
        else {
            System.out.println("Not All are big names");
        }


        // Stream Creation Operations

        //create empty stream
        Stream<Student> emptyStream = Stream.empty();
        //here count no of elemnts
        System.out.println("creating empty "+emptyStream.count());

       /* 5.1.2) of(T t) : Creates a stream of single element of type T
        Method Signature : public static<T> Stream<T> of(T t)*/
        Stream<Student> singleElementStream = Stream.of( new Student());
        System.out.println("Stream of single Element of Type Student "+singleElementStream.count());
        //1

//        5.1.3) of(T… values) : Creates a stream from values
        //Method Signature : public static<T> Stream<T> of(T… values)
        Stream<Integer> streamOfInteger = Stream.of(7,2,4,1,3,6,5);
        System.out.println(streamOfInteger.count()); // 7

//        5.1.4) Creating streams from collections

        //Creating a stream from List
        List<String> listOfString = new ArrayList<>();

        listOfString.add("one");
        listOfString.add("two");
        listOfString.add("three");
        listOfString.add("four");
        listOfString.add("five");
        listOfString.add("six");
        System.out.println("creating a stream from collections ");
        listOfString.stream().forEach(s-> System.out.print(s+" "));

        System.out.println(" filtering stream elements ");
        List<String> filterref = new ArrayList<>();
        filterref.add("Sampada");
        filterref.add("Johnson");
        filterref.add("Samontika");
        filterref.add("Brijesh");
        filterref.add("John");

        System.out.println("filtering element which length greater than 5 ");
        filterref.stream().filter(el -> el.length() > 5).forEach(s -> System.out.print(s +" "));

        /*distinct() : Selects only unique elements
        Method Signature : Stream<T> distinct()*/
        System.out.println("-------------------------");
        System.out.println("removing duplicate elements from the list using distinct() ");
        List<String> distinctref = new ArrayList<>();
        distinctref.add("Sampada");
        distinctref.add("Johnson");
        distinctref.add("Samontika");
        distinctref.add("Brijesh");
        distinctref.add("John");
        distinctref.add("Sampada");
        distinctref.add("Johnson");
        distinctref.stream().distinct().forEach(s-> System.out.print(s +" "));

        /*Selects first n elements
        Method Signature : Stream<T> limit(long maxSize)*/

        List<String> skipref = new ArrayList<>();
        skipref.add("Sampada");
        skipref.add("Johnson");
        skipref.add("Samontika");
        skipref.add("Brijesh");
        skipref.add("John");
        skipref.add("Sampada");
        skipref.add("Johnson");
        skipref.add("Samontika");
        skipref.add("Brijesh");
        System.out.println("Total length of list "+skipref.size());
        System.out.println("we are skipping 3 element then removing duplicate then filtering element whose size is greater than 5");
        skipref.stream().skip(3).distinct().filter(s -> s.length()>5).forEach(s -> System.out.print( " "+s));

        /*map() : Applies a function
        Method Signature : Stream<R> map(Function<T, R> mapper);*/
        /*Returns a stream consisting of results after applying given function to elements of the stream.*/

        List<String> mappref = new ArrayList<>();
        mappref.add("Sampada");
        mappref.add("Johnson");
        mappref.add("Samontika");
        mappref.add("Brijesh");
        mappref.add("John");
        mappref.add("Dhanaji");
        mappref.add("Sambhaji");
        mappref.add("Ajay");
        mappref.add("Vijay");
        mappref.add("Suraj");
        mappref.add("Pravin");
        System.out.println(" --------------------------- ");
        System.out.println("Passing map element as string return output as each element length ");
        mappref.stream().map(String::length).forEach(s -> System.out.print(s +" "));

        /*sorted() : Sorting according to natural order
        Method Signature : Stream<T> sorted()*/
        List<String> sorteref = new ArrayList<>();
        sorteref.add("Sampada");
        sorteref.add("Johnson");
        sorteref.add("Samontika");
        sorteref.add("Brijesh");
        sorteref.add("John");
        sorteref.add("Dhanaji");
        sorteref.add("Sambhaji");
        sorteref.add("Ajay");
        sorteref.add("Vijay");
        sorteref.add("Suraj");
        sorteref.add("Pravin");
        System.out.println("Before sorting ");
        System.out.println( sorteref);
        System.out.println("After Natural Order sorting : ");
        sorteref.stream().sorted().forEach(s-> System.out.print(s +" "));

        System.out.println("After Custom sorting According to element length : ");
        sorteref.stream().sorted((String name1, String name2) -> name1.length() - name2.length()).forEach(s-> System.out.print(s +" "));
    }
}
