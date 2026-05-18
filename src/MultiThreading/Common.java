package MultiThreading;

public class Common {

    public static synchronized void fun1(String name){
        System.out.println("Welcome");

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println(name);
    }
}
