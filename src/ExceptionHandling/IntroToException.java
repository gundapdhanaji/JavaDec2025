package ExceptionHandling;

public class IntroToException {

    public  void  divide(int a, int b){
        int result = a/b;
        System.out.println("result is : "+result);
        System.out.println("Execution is done ");
    }

    public static void main(String[] args) {
        System.out.println("Inside main.......");
        IntroToException obj = new IntroToException();

        obj.divide(100,10);

        int[] arr = new int[5];
        //lower index = 0;
        //higher index = 4
        arr[4]=20;
        System.out.println(" Value at index 4 "+arr[4]);
//  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
//	at ExceptionHandling.IntroToException.main(IntroToException.java:13)

        Integer a = Integer.parseInt("123");
        System.out.println(a); // 123
        Integer ba = Integer.parseInt("Dhanaji");
        System.out.println(ba);
// Exception in thread "main" java.lang.NumberFormatException: For input string: "Dhanaji"
//	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        obj.test();
        System.out.println("End of main....");
    }
    public void test(){
        System.out.println("This is a test method");
    }
}
