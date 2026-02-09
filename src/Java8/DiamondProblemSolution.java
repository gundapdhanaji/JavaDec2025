package Java8;

interface Parent1{
    default void show(){
        System.out.println("Default method of Parent1 Interface");
    }

}

interface Parent2{
    default void show(){
        System.out.println("Default method of Parent2 Interface");
    }
}
public class DiamondProblemSolution implements Parent1,Parent2 {
    @Override
    public void show() {
        Parent2.super.show(); //InterfaceName.super.methodName
    }

    public static void main(String[] args) {
        DiamondProblemSolution solution = new DiamondProblemSolution();
        solution.show();
    }
}
