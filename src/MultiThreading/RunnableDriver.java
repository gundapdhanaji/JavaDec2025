package MultiThreading;

public class RunnableDriver {

    public  static void fun1(){
        for (int i=0; i<10; i++){
                System.out.println("using method reference in the RunnableDriver "+i);
            }
        System.out.println("End of fun1() method");
    }
    public static void main(String[] args) {
        UsingRunnableInterface anInterface = new UsingRunnableInterface();

//        Thread thread = new Thread(anInterface); ordinary way
//        thread.start();

        //using lambda Expression
//        Thread thread = new Thread(()->{
//            for (int i=0; i<10; i++){
//                System.out.println("Inside run method of UsingRunnableInterface "+i);
//            }
//            System.out.println("End of Run Method ");
//        });
//        thread.start();

        //using method reference
//        Thread thread = new Thread(RunnableDriver::fun1);
//        thread.start();
        for (int i=70; i<80; i++){
            String tName = Thread.currentThread().getName();
            System.out.println("current Running Thread  "+tName);
            System.out.println("Inside main of Runnable Driver "+i);
        }
    }
}
