package MultiThreading;

public class ThreadSafeDriver {

   public static void main(String[] args) {
        ThreadC tc = new ThreadC();

        Thread t1 = new Thread(tc);
        Thread t2 = new Thread(tc);

        t1.start();
        t2.start();
       int noOFcore = Runtime.getRuntime().availableProcessors();
       System.out.println(noOFcore);

    }
}
