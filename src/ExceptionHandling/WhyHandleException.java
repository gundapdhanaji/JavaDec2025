package ExceptionHandling;

public class WhyHandleException {

    public static void main(String[] args) {
        System.out.println("Start of Main method ");
        WhyHandleException obj = new WhyHandleException();
//          WhyHandleException obj = null; Exception in thread "main" java.lang.NullPointerException
//	at ExceptionHandling.WhyHandleException.main(WhyHandleException.java:9)


        WhyHandleException obj2 = null;
        try {
            obj2.test();
        } catch (Exception e){
            System.out.println("Got in catch block as code written in try block had some issues ");
            e.printStackTrace();
        }

        int a = 100/10;
        System.out.println("Result of Division of is "+a);
        System.out.println("End of Main method ");
    }
    void test(){
        System.out.println("Test method executed ");
    }
}
