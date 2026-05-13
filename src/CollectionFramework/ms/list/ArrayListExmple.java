package CollectionFramework.ms.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExmple {

   public static void main(String[] args) {
       ArrayList<String> al = new ArrayList<>();
       al.add("A");
       al.add("B");
       al.add("C");
       al.add("D");
       al.add("D");
       System.out.println("In for each we call toLowerCase() method");
       for (String str : al){
           System.out.print(str.toLowerCase() + " ");
       }

       System.out.println("Print Element using Iterator ");

       Iterator<String> iterator1 = al.iterator();

       while (iterator1.hasNext()){

           iterator1.next();

           System.out.println();
       }
   }
}
