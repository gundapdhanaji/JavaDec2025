package ExceptionHandling.sm;

public class UsingCustomException {

    public int getPension(int age, int salary) throws InvalidAgeException {
        System.out.println("start of getPension......");

        int pension=0;

        if(age > 40 && age < 100)
            pension = (age*salary)/100;
        else{

            InvalidAgeException iae = new InvalidAgeException("Invalid Age.........");
            throw  iae;
        }
        return pension;
    }

   public static void main(String[] args) {
        UsingCustomException customException = new UsingCustomException();
       try {
           int pen =customException.getPension(50,80000);
           System.out.println("Pension is "+pen);
       } catch (InvalidAgeException e) {
           throw new RuntimeException(e);
       }
   }
}
