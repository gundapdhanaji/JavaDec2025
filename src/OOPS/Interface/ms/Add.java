package OOPS.Interface.ms;

public class Add implements ConstantValues{
    int a = x;
    int b = y;

    void m1(){
        System.out.println("Value of a accessing from interface ConstantValues: "+a);
        System.out.println("Value of b accessing from interface ConstantValues: "+b);
    }

    void sum(){
        int s = x+y;
        System.out.println("Sum is "+s);
    }
}
