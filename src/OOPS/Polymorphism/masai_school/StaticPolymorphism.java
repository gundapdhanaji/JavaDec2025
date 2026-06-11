package OOPS.Polymorphism.masai_school;

public class StaticPolymorphism {
    void fun1(byte b){
        System.out.println("inside fun1(byte) of Demo "+b);

        for (int i=0; i<100; i++){
            System.out.println("Variable value "+i);
        }

    }

    void fun1(int i){
        System.out.println("inside fun1(int) of Demo "+i);
//10000 line of code
        for (int j=101; j<500; j++){
            System.out.println("Variable value "+j);
        }
    }
    public static void main(String[] args) {
        StaticPolymorphism sts = new StaticPolymorphism();
        byte b = 20;
        sts.fun1(b);
    }
}
