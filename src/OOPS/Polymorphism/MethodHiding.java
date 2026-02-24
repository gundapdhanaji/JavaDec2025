package OOPS.Polymorphism;

 class Parent{
    public static  void display(){
        System.out.println("Static method from Parent class");
    }
}
class Child extends Parent{
    public static  void display(){
        System.out.println("Static method from Child class");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();
        System.out.println("In case of static method we give parent ref with child object then not" +
                "not override child class method implementation");
        Parent parent2 = new Child();
        parent2.display();

        Child child = new Child();
        child.display();

        System.out.println("If we have child class ref and holding/creating parent class object" +
                "then it gives compile time error becoz we need down-casting  ");
//        Child child1 = new Parent();
//        child1.display();


    }
}
