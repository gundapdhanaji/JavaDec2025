package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    //ArrayList => Dynamic Array
    //array size static

    public static void main(String[] args) {

        int[] arr = new int[10];
        // lowest index 0;
        // highest index 1
        // arr[20] array out of bond exception

        List<Integer> list = new ArrayList<>();
//        List<int> list1 = new ArrayList<>();  Type argument cannot be of primitive type
        System.out.println("Size is "+list.size());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
//        list.add(50);
//        list.add(60);
//        list.add(70);
//        list.add(80);
//        list.add(90);
//        list.add(100);
//        list.add(110);
        list.add(4,100);

        System.out.println("Size is "+list.size());

        System.out.println("Element in the AL "+list);

    }
}
