package Constructors;

class GrandParent{
    public GrandParent(){
        System.out.println("Grand Parent no arg constructor");
    }
    public GrandParent(int a, int b, int c){
        System.out.println("Addition of 3 arguments in a Grand parent class");
        int result = a+b+c;
        System.out.println("Addition = "+result );
    }
//    public GrandParent(){
//        System.out.println("Grand Parent 3 arg constructor");
//    }
}

class Parent extends GrandParent{

    public Parent(){
        this(100,200,300);
        System.out.println("no-arg constructor of Parent");
    }
    public Parent(int a, int b){
        System.out.println("Addition of 2 arguments in a parent class");
        int result = a+b;
        System.out.println("Addition = "+result );
    }

    public Parent(int a, int b, int c) {
        super(a, b, c); //HERE WE ARE CALLING GRAND PARENT CLASS 3 ARGUMENT CONSTRUCTOR
    }
}

public class CombiOfSuperAndThisKeywordOrMethod extends Parent{
    public static void main(String[] args) {
        CombiOfSuperAndThisKeywordOrMethod intro = new CombiOfSuperAndThisKeywordOrMethod();
    }
}
