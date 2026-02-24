package OOPS.Polymorphism;

class A{
    A get(){
        return this;
    }
}
class B1 extends A{
    @Override
    B1 get(){
        return this;
    }
    void message(){
        System.out.println("Welcome to Covariant return type");
    }
}
public class CovariantType {
    public static void main(String[] args) {
        new B1().get().message();
    }
}
