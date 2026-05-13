package ExceptionHandling.sm;

public class A {

    int i = 10;

    public A() throws InvalidAgeException{
        System.out.println("Inside constructor of A");
    }
    public void funA(){
        System.out.println("FunA of class A ");
    }
}
