package Static;

public class StaticIntro {
    String name = new String("Java"); //non-primitive

    int instanceAge = 999;

    static int staticSalary = 10000;

    void instanceMethod(){
        System.out.println("Instance Method ");
    }
    void staticMethod(){
        System.out.println("Static Method ");
    }

    public static void main(String[] args) {
        StaticIntro obj1 = new StaticIntro();
        obj1.instanceMethod();
        System.out.println("Accessing instance variable "+obj1.instanceAge);
    }
}
