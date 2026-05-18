package MultiThreading;

public class IntroToMultiThreading {

    void fun1(){
        //10000
        // --- data transfer 10GB  -- DMA ---> CPU
        //DMA work under the CPU. CPU will assign this data transfer job to the DMA ckt

    }

    void fun2(){
        //5000
    }

    void fun3(){

    }
    //Scheduling : It is process in which a specific time period is allocated to a function
    //Scheduler (OS scheduler - part of Operating System process based multiTasking
    //           thread scheduler - part of JVM thread based multiTasking)


    //another flow along with main thread simultaneously
    //default thread (main thread :-- main method)
    static void main(String[] args) {
        IntroToMultiThreading intro = new IntroToMultiThreading();
        intro.fun1();
        intro.fun2();
        intro.fun3();
    }
}
