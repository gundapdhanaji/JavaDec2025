package OOPS.Polymorphism.LabQuestions;
//1) What will be the output of the following program?
class A{

}

class B extends A{

}

class C extends B{

}

public class Question1 {
    static void overloadedMethod(A a){
        System.out.println("ONE");
    }
    static void overloadedMethod(B b){
        System.out.println("TWO");
    }
    static void overloadedMethod(Object obj){
        System.out.println("THREE");
    }

    public static void main(String[] args) {
        C c = new C();

        overloadedMethod(c); // THREE
    }
}
/*
output TWO
Because method overloading is decided at compile time, based on the //reference type, not runtime object.
When multiple overloaded methods match,
Java chooses the most specific one.
*/