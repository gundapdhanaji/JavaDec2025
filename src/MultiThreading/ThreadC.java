package MultiThreading;

public class ThreadC implements Runnable {
    public void fun1(){
        System.out.println("Welcome.....");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("User..");
    }

    @Override
    public void run() {
        fun1();
    }
}
