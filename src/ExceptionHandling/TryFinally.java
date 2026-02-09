package ExceptionHandling;

public class TryFinally {
    public static void main(String[] args) {

        try{
            int a = 100/0;
        }catch (ArithmeticException ae){
            System.out.println("Got exception ");
            ae.printStackTrace();
        }finally {
            System.out.println("Finally Block :: Code will always gets Executed " +
                    "whether exception occurs or not ");
        }
    }
}
