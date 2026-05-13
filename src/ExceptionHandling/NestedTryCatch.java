package ExceptionHandling;

public class NestedTryCatch {
    public static void main(String[] args) {

        String name = "Scientecheasy Tutiorial";
        int [] numArray = {10,20,30,40,50};
//        try{
//            name = null;
//            name = "Dhanaji";
//            int nameLength = name.length();
//            System.out.println("Length of name "+nameLength);
//            try{
//                int digit = 70;
//                numArray[6]=digit;
//            }
//            catch (ArrayIndexOutOfBoundsException aio){
//                System.out.println("Exception is thrown");
//                System.out.println(aio);
//            }
//        }
//        catch (NullPointerException npe){
//            System.out.println("Exception is thrown");
//            System.out.println(npe);
//        }
        try{
            name = "Dhanaji";
            int nameLength = name.length();
            System.out.println("Length of name "+nameLength);
            try{
                int digit = 70;
                numArray[6]=digit;
            }
            catch (ArithmeticException ae){
                System.out.println("Exception is thrown");
                System.out.println(ae);
            }
        }
        catch (NullPointerException npe){
            System.out.println("Exception is thrown");
            System.out.println(npe);
        }

        System.out.println("Exception Handle in outer catch block");
    }
}
