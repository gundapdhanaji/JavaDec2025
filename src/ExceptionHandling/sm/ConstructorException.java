package ExceptionHandling.sm;

public class ConstructorException {

    public ConstructorException() throws InvalidAgeException {
        System.out.println("Inside constructor of ConstructorException Class");
    }

   public static void main(String[] args) {
       System.out.println("start of main ......");

       try {
           ConstructorException ce = new ConstructorException();
       } catch (InvalidAgeException e) {
           throw new RuntimeException(e);
       }

   }

}
