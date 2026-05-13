package CollectionFramework.ms.hashset;

import java.util.HashSet;

public class HashSetExample {

   public static void main(String[] args) {

       HashSet<String> hs  = new HashSet<>();

       hs.add("A");
       hs.add("B");
       hs.add("C");
       hs.add("D");
       hs.add("E");

       System.out.println("hashSet Elements "+hs);
    }
}
