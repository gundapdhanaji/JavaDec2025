package Java8.FunctionalInterface;

interface Test{
    void a();

    default void b(){
        System.out.println("Default method in a functional interface");
    }

    static void c(){
        System.out.println("static method in a functional interface");
    }
}

class TestA1 implements Test{

    @Override
    public void a() {

    }
}
class TestA2 implements Test{

    @Override
    public void a() {

    }
    @Override
    public void b(){
        System.out.println("Override Default method of Test interface in Class TestA2 : ");
    }
}
class TestA3 implements Test{

    @Override
    public void a() {

    }
}
class TestA4 implements Test{

    @Override
    public void a() {

    }
}

public class BackwardCompatibilityTest implements  Test{

    @Override
    public void a() {
        System.out.println("Test Interface method override in a BackwardCompatibilityTest class");
    }

    @Override
    public void b() {
        System.out.println("Test Interface default method override in a BackwardCompatibilityTest class");
    }

    public static void main(String[] args) {

        BackwardCompatibilityTest compatibilityTest = new BackwardCompatibilityTest();
        compatibilityTest.a();
        compatibilityTest.b();
    }


}
