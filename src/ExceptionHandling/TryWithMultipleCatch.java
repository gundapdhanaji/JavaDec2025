package ExceptionHandling;

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        try {
            int [] arr = {1,2,3,4,5};
            System.out.println(arr[5]);

            int result = 100/0;
            System.out.println("Result is "+result);

            TryWithMultipleCatch twmc= null;
            twmc.test();
        }
        catch (Exception e){
            System.out.println("Got Exception "+e.getCause());
        }
        // Exception 'java. lang. ArrayIndexOutOfBoundsException' has already been caught
//        catch (IndexOutOfBoundsException iobe){
//            System.out.println("Got IndexOutOfBoundsException "+iobe.getCause());
//        }
//        catch (ArrayIndexOutOfBoundsException aiobe){
//            System.out.println("Got ArrayIndexOutOfBoundsException "+aiobe.getCause());
//        } Exception 'java. lang. ArrayIndexOutOfBoundsException' has already been caught
//        catch (ArithmeticException ame){
//            System.out.println("Got ArithmeticException "+ame.getCause());
//        }
//        catch (NullPointerException npe){
//            System.out.println("Got NullPointerException "+npe.getCause());
//        }
    }

    public void test(){
        System.out.println("Test method in TryWithMultipleCatch Class");
    }
}
