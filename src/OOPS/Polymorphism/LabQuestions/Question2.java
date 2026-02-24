package OOPS.Polymorphism.LabQuestions;

public class Question2 {

    void method(int ...a){
        System.out.println("1");
    }
//    void method(int[] a){
//        System.out.println("2");
//    }
    /*
    * compile time error
    * int... a is called Varargs (Variable Arguments) in Java.
    * This method can accept any number of int values (including zero).
    * Internally
    * int... a is treated as:
    * int[] a
    * So inside the method, a is actually an array of integers.
    * You can call this method in many ways:
    * method();              // 0 arguments
    * method(10);            // 1 argument
    * method(10, 20);        // 2 arguments
    * method(1, 2, 3, 4, 5); // many arguments

    * void method(int... a){
    for(int num : a){
        System.out.println(num);
    }
    }
    method(5, 10, 15);

     */
}
