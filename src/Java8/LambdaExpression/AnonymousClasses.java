package Java8.LambdaExpression;

interface AA{
    void test(int a, String name);
    void aaa();
}
public class AnonymousClasses {

    public static void main(String[] args) {
        //using anonymous class
        AA aa = new AA() {
            @Override
            public void test(int a, String name1) {
                System.out.println("Test method implemented "+a+" "+ name1);
            }

            @Override
            public void aaa() {
                System.out.println("aaa method");
            }
        };
        aa.test(100,"Java");
        aa.aaa();
    }
}
