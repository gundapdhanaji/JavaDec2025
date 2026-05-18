package MultiThreading;

public class UsingRunnableInterface implements Runnable {

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println("Inside run method of UsingRunnableInterface "+i);
        }
        System.out.println("End of Run Method ");
    }
}
