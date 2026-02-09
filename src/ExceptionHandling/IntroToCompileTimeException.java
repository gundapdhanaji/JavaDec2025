package ExceptionHandling;

public class IntroToCompileTimeException {

    public static void main(String[] args) {
        try {
//            Class cls = Class.forName("ExceptionHandling.IntroToCompileTimeException123"); Exception in thread "main" java.lang.RuntimeException:
//            java.lang.ClassNotFoundException: ExceptionHandling.IntroToCompileTimeException123
//	          at ExceptionHandling.IntroToCompileTimeException.main
            Class cls = Class.forName("ExceptionHandling.IntroToCompileTimeException");
            IntroToCompileTimeException obj = (IntroToCompileTimeException) cls.newInstance();
            obj.test();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    void test(){
        System.out.println("Calling Test Method");
    }
}
