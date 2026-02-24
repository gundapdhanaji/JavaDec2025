package Java8.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class ListIteratingUsingLambda {

    public static void main(String[] args) {

        //prior Java 8

        List<String> features = Arrays.asList("Lambda", "Default Method","Stream API","Date and Time API");
        System.out.print("Without using Lambda Expression : ");
        for (String feature: features){
            System.out.print(feature +" ");
        }

        System.out.println("Using Lambda Expression ");

        List<String> features1 = Arrays.asList("Lambda", "Default Method","Stream API","Date and Time API");
//        features1.forEach(ele -> System.out.print(ele + " ")); //using lambda
          features1.forEach(System.out::println);//using method ref
    }

}
