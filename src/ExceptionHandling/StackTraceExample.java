package ExceptionHandling;

public class StackTraceExample {

    public static void methodA() {
        methodB();
    }

    public static void methodB() {
        methodC();
    }

    public static void methodC() {
        // This line will throw a NullPointerException because the string is null
//        String str = null;
          String str = "How are you ?";
        System.out.println(str.length()); // Line 26
    }
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("An exception occurred:");
            // Print the stack trace
            e.printStackTrace();
        }
    }
}

