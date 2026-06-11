package OOPS.Abstraction.masai_school;

public class Apache extends Bike {
    void run(){
        System.out.println("running safely");
    }

    public static void main(String[] args) {
        Bike bike = new Apache();
        bike.run();
    }
}
