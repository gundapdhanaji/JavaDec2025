package CollectionFramework.ms.list;

import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println(al);

        al.add("Delhi");
        al.add("Mumbai");
        System.out.println(al);
//        System.out.println("Default capacity of an ArrayList "+al.s);
        System.out.println(" size of an ArrayList "+al.size());
    }
}
