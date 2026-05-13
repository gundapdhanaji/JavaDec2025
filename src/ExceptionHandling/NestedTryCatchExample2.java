package ExceptionHandling;

public class NestedTryCatchExample2 {
//    public static void main(String[] args) {
//        try {
//            int[] x = {0, 1, 2};
//
//            try {
//                int[] y = {10, 20};
//                int z = y[1] / x[0];
//                System.out.println("Throwing Arithmetic Exception ");
//            } catch (ArrayIndexOutOfBoundsException aio) {
//                System.out.println("Inside try catch block");
//                System.out.println(aio.toString());
//            }
//        }
//        catch (ArithmeticException ae){
//            System.out.println("Inside try catch block");
//            System.out.println(ae.toString());
//        }
//        finally {
//            System.out.println("Finally always runs whether exception occur or not ");
//        }
//        //compile time error finally without try
////        finally{
////            System.out.println("multiple finally ");
////        }
//        System.out.println("Outside catch block ");
//    }

public static void main(String[] args) {
    int a = 20, b = 0;
    try
    {
        System.out.println("Value of a: " +a);
        System.out.println("Value of b: " +b);
        int div = a/b;
        System.out.println("Division: " +div);
    }
    catch(NullPointerException npe)
    {
        System.out.println(npe); // prints corresponding exception.
    }

    finally
    {
        System.out.println("Denominator cannot be zero");
    }
//    Code after finally runs ONLY IF exception is handled
    System.out.println("Hello Java");
}

}
