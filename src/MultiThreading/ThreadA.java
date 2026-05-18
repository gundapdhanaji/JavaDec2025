package MultiThreading;

public class ThreadA implements  Runnable{
    @Override
    public void run() {
        for (int i=0; i<10; i++){
            String currThread = Thread.currentThread().getName();
            System.out.println(currThread+" Thread is Running");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }
    }
}
