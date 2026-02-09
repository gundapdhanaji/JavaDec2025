package Java8.FunctionalInterface;

interface  AAA{
    void test();
    void add();

    default void multiply(){
        System.out.println("This is default method");
    }

    static void substraction(){
        System.out.println("static method");
    }
}

class  AAAImpl implements AAA{

    @Override
    public void test() {

    }

    @Override
    public void add() {

    }
}

class  AAAImpl2 implements AAA{

    @Override
    public void test() {

    }

    @Override
    public void add() {

    }

    @Override
    public void multiply() {
        System.out.println("Overriding default method of interface");
    }
}

class  AAAImp3 implements AAA{

    @Override
    public void test() {

    }

    @Override
    public void add() {

    }
}
public class BackwardCompatibility {

}
