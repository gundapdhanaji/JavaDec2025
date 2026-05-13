package ExceptionHandling.sm;

public class ThrowExample {

    public int getPension(int age, int salary){
        int pension = 0;
        if (age > 40 && age < 100)
            pension = (age * salary)/100;
        else {
            ArithmeticException ae = new ArithmeticException("Invalid age");
            throw ae;
        }
        return pension;
    }

    public static void main(String[] args) {
        System.out.println("start of main.......");

//        System.out.println(1.0/0.0);

        ThrowExample th1 =new ThrowExample();
        try {
            int pen = th1.getPension(300,80000);

            System.out.println("Total pension is "+pen);
        }catch (ArithmeticException ae)
        {
            System.out.println("Arithmetic exception "+ae);
            System.out.println("Arithmetic exp getMessage() "+ae.getMessage());
        }

        System.out.println("end of main.......");
    }
}
