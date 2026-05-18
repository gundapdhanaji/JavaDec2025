package MultiThreading.scientecheasy;

public class MyThread extends Thread{

    //define the task what thread do
    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println("Current Thread and number : "+Thread.currentThread().getName()+"  "+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("Handle the exception "+ie);
            }
        }
    }
}
