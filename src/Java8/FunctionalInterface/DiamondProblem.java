package Java8.FunctionalInterface;

interface A1{
    default void show(){
        System.out.println("show method of  A1 interface");
    }
}

interface A2{
    default void show(){
        System.out.println("show method of A2 interface");
    }
}
public class DiamondProblem implements A1, A2{
    @Override
    public void show() {
        //InterfaceName.super.methodName()
        A2.super.show();
    }

    public static void main(String[] args) {
        DiamondProblem obj = new DiamondProblem();
        obj.show();
    }
}
