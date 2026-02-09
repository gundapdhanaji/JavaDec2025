package Static;

public class StaticWorking {
    static int staticvar = 100;
    int instancevar = 300;

    public static void main(String[] args) {
        StaticWorking obj1 = new StaticWorking();
        StaticWorking obj2 = new StaticWorking();
        System.out.println("obj1 static var value "+obj1.staticvar);
        System.out.println("obj2 static var value "+obj2.staticvar);
        System.out.println("changing static var value at obj2.staticvar = 501 so update value of static");
        obj2.staticvar = 501;
        System.out.println(obj1.staticvar); // 501
        System.out.println(obj2.staticvar); // 501

    }
}
