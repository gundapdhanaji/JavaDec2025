package MultiThreading;

public class SynchronizedDriver {

    public static void main(String[] args) {
        Common c = new Common();
        Common c2 = new Common();

        //sharing same common object to two thread
        ThreadD td = new ThreadD(c,"Ram");
        ThreadD td2 = new ThreadD(c2,"Shyam");

        td.start();
        td2.start();
    }
}
