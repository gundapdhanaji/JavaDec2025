package Java8.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {

    public static void main(String[] args) {

     List<Integer> intList = Arrays.asList(8,2,1,3,6,7,9,5,12,11,13);

   List<Integer> oddNumbers =  intList.stream().filter(e -> e%2 != 0).toList();

        System.out.println(oddNumbers);

    }
}
