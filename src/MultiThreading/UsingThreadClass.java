package MultiThreading;

public class UsingThreadClass extends Thread {

    @Override
    public void run(){
        System.out.println("run method start.....");
        for (int i=0; i<15; i++){
            System.out.println("inside run method "+i);
        }
        System.out.println("end of run() method");
    }

    public static void main(String[] args) {
        // ----- here one thread (main)
        UsingThreadClass threadClass = new UsingThreadClass();

//        threadClass.run();//it will be called as a normal method
          threadClass.start();
//          threadClass.start();    .IllegalThreadStateException

        for (int i=25; i<50; i++){
            System.out.println("inside main method "+i);
        }

        System.out.println("end of main() method...");
    }
}
