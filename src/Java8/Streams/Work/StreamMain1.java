package Java8.Streams.Work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

    public static void main(String[] args) {
        //Q) Create a List and Filter all even number from list

          List<Integer> list1 =  List.of(1,2,3,4,5,7,9,11,50,21,22,67);
//        System.out.println(list1);
//          list1.add(45);  throwing UnsupportedOperationException exception

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(16);
        list2.add(22);
        list2.add(28);
        list2.add(30);
        list2.add(35);
        list2.add(13);
        list2.add(15);
        list2.add(21);
        list2.add(23);
        list2.add(25);
        list2.add(37);


    List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18);
        System.out.println("create list using asList method "+list3);
//        list3.add(10); throwing UnsupportedOperationException exception
        System.out.println("Original List "+list2);
        System.out.println("finding even element without using stream");
        List<Integer> evenList = new ArrayList<>();
        for (Integer i : list2){
            if (i % 2 ==0) {
                evenList.add(i);
            }
        }
        System.out.println(evenList);
        System.out.println("finding even element using stream");

        Stream<Integer> listStream =list2.stream();
        List<Integer> list = listStream.filter(i -> i%2 == 0).toList();
        System.out.println(list);

        List<Integer> oddNumbers = list2.stream().filter(i -> i%2  != 0).toList();

        System.out.println("odd numbers using stream "+oddNumbers);

        System.out.println("Print numbers greater than 10 without taking extra ref variable : ");
        list2.stream().filter(i -> i>10).toList().forEach(i-> System.out.print(" "+i));
        System.out.println();
        System.out.println("Print even numbers multiply by 2 using map method : ");
        list2.stream().map(i -> (i*2)).toList().forEach(i -> System.out.print(" "+ i));
    }
}
