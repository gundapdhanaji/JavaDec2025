package ExceptionHandling;

public class ExceptionInTry_CatchBlock {

    public static void main(String[] args) {

        try{
            System.out.println("111");
            System.out.println("222");
            System.out.println(10/0);
            System.out.println("333");
            System.out.println("444");
        }catch (ArithmeticException ae){
            System.out.println(20/0);
            System.out.println(ae.toString());
        }
        finally {
            System.out.println("555");
            System.out.println("666");

        }
    }
}
