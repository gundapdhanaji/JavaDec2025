package OOPS.Interface;

interface ConstantValues{
    //declaration of interface variables
    int x=20;
    int y=30;
}

class Add implements ConstantValues{
    int a = x;
    int b = y;

    void m1(){
        System.out.println("Value of a "+a);
        System.out.println("Value of b "+b);
    }

    void sum(){
        int s = a + b;
        System.out.println("Sum is "+s);
    }
}

class  Sub implements ConstantValues {

    void sub(){
        int substract = y - x;
        System.out.println("Substraction is "+substract);
    }
}
public class InterfaceConstantValues {

    public static void main(String[] args) {
        Add a = new Add();
        a.m1();
        a.sum();


    }
}
