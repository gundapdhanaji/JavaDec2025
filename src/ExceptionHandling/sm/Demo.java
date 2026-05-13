package ExceptionHandling.sm;

public class Demo extends A{

    public Demo() throws InvalidAgeException {
        super();
    }
    public static void main(String[] args) {
        System.out.println("start of main.....");

        try {
            Demo d1 = new Demo();
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }

        System.out.println("end of main...");
    }
}
