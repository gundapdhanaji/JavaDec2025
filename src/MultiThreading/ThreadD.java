package MultiThreading;

public class ThreadD extends Thread{
    Common c;
    String name;

    public ThreadD(Common c, String name){
        this.c=c;
        this.name=name;
    }

    @Override
    public void run(){
        c.fun1(name);
    }
}
