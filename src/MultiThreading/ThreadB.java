package MultiThreading;

public class ThreadB implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<15; i++){
            String currThread = Thread.currentThread().getName();
            System.out.println("Current running thread inside ThreadB "+currThread);
        }
    }
}
