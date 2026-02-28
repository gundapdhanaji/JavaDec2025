package OOPS.Interface.ms;

interface  A{
    void msg();
}

class B implements A{

    @Override
    public void msg() {
        System.out.println("Implement abstract method in a Class B");
    }
    void show(){
        System.out.println("B class specific concrete method ");
    }
}
public class IntrRefImplClsObj {
    public static void main(String[] args) {
        A a = new B();
        a.msg(); // here we call implemented method of a B class
        //a.show(); //give compile time error because we call only methods implemented in B class
        // not a specific method of B class with interface reference

        B b = new B();
        b.msg();
        b.show();
    }
}
