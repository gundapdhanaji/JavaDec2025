package OOPS.Inheritance.ms;

public class B extends A {
    int b;

    void show(){
        System.out.println("Method in a B class b variable value "+b);
    }

    void display(){
        System.out.println("we can direct access instance variable of A class in B class instance method "+a);
    }
    public static void main(String[] args) {

        B b1 = new B(); // no casting
        System.out.println("a variable in B class before modification default value "+b1.a);
        b1.a = 25;
        System.out.println("a variable in B class after modification "+b1.a);

        A a1 = new B(); //upcasting
        System.out.println("parent class reference child class object we call parent class instance variable "+a1.a);
        //downcasting not allowed in java showing classCast exception at compile time

        B b2 = (B) new A(); //downcasting explicitly throwing error at run time
        /*Your line B b2 = new A(); fails because the compiler cannot guarantee that an object of
        type A will have the extra fields or methods defined in class B.*/
        System.out.println("child class reference parent class object we call parenct class instance variable "+b2.a);

        A a2 = new A();

        B b3 = (B)a2; //showing classCast Exception at run time
        b3.display();

    }
}
