package OOPS.Interface;

interface BB1{
    void display();
}

interface BB2{
    void display();
    void show();
}
public class DiamondProblemUsingInterface implements BB1,BB2 {

    @Override
    public void display() {
        System.out.println("Implemented Display Method");
    }

    @Override
    public void show() {
        System.out.println("contract fulfilled");
    }
}
