package MultiThreading;

public class DriverClass {
    public static void main(String[] args) {
        ThreadA ta = new ThreadA();
        ThreadB tb = new ThreadB();

        Thread t1 = new Thread(ta);
//        Thread t2 = new Thread(ta);

        t1.setName("Raj");
//        t2.setName("Simran");
        t1.start();
//        t2.start();

        for (int i=0; i<10; i++){
            Thread.currentThread().setName("MasterThread");
            System.out.println("Inside main thread "+Thread.currentThread().getName());
        }
//        System.out.println("End of main method.................");
    }
}
