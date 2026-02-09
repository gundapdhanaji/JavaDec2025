package ExceptionHandling;

public class IntroToException {

    public static void main(String[] args) {
        IntroToException obj = new IntroToException();

        obj.divide(100,10);

        int[] arr = new int[5];
        //lower index = 0;
        //higher index = 4
//        System.out.println("Set value for exception "+arr[10]);
//  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
//	at ExceptionHandling.IntroToException.main(IntroToException.java:13)

        Integer a = Integer.parseInt("123");
        System.out.println(a); // 123
        Integer ba = Integer.parseInt("Dhanaji");
        System.out.println(ba);
// Exception in thread "main" java.lang.NumberFormatException: For input string: "Dhanaji"
//	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
    }
    public  void  divide(int a, int b){
        int result = a/b;
        System.out.println("result is : "+result);
        System.out.println("Execution is done ");
    }
}
