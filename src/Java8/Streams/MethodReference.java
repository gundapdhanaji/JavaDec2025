package Java8.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class MethodReference {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

//        list.stream().
//                map(String s -> Integer.parseInt(s)).
//                forEach(element -> System.out.println(element));


        //method reference
        list.stream().
                map(Integer::parseInt).
                forEach(System.out::println);

        List<String> strlist = new ArrayList<>();

        strlist.add("ABCD");
        strlist.add("EFGH");
        strlist.add("IJKL");
        strlist.add("MNOP");
        strlist.add("QRST");
        strlist.add("UVWX");

        strlist.stream().
                map(String::toLowerCase).
                forEach(System.out::println);

        Company c = new Company("My Company",10000);

        Supplier<String> lambdaSupplier = () -> c.getName();
        System.out.println(lambdaSupplier.get());

        Supplier<Double> doubleSupplier = () -> c.getSalary();
        System.out.println(doubleSupplier.get());

    }
}

class Company
{
    String name;
    double salary;
    public Company(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }
}
