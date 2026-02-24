package OOPS.Polymorphism;

class A1 {
    A1 foo() {
        return this;
    }

    void print() {
        System.out.println("Inside the Class A1");
    }
}

//class A2 extends A1
class A2 extends A1 {
    A1 foo() {
        return this;
    }

    void print() {
        System.out.println("Inside the class A2");
    }
}

//class A3 extends A2
class A3 extends A2 {
    A3 foo() {
        return this;
    }

    void print() {
        System.out.println("Inside the class A3");
    }
}

public class CovariantType2 {
    public static void main(String[] args) {
        A3 a1 = new A3();
        A3 foo = a1.foo();
        a1.print();



        System.out.println("=====================");
        A3 a2 = new A3();
        A3 foo1 = a2.foo();
        a2.print();

        System.out.println(foo == foo1);


    }
}
