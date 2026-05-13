package ExceptionHandling.sm;

public class ThrowsExample {
//    public int getPension(int age, int salary) throws ArithmeticException{ //not mandatory at method signature
public int getPension(int age, int salary) throws ClassNotFoundException {
        System.out.println("start of getPension");

        int pension = 0;

        if(age > 40 && age < 100){
            pension = (age * salary)/100;
        }else{
            //write some alternate logic here
//            System.out.println("invalid age ..");
            //but method author has not done, and it delegates the exception handling duty to the caller
            //by throwing an exception

//            ArithmeticException ae = new ArithmeticException("Invalid Age");
//            throw ae;
              ClassNotFoundException cfe = new ClassNotFoundException("Class Not Found Exception Invalid age....");
              throw cfe;
        }
        System.out.println("end of getPension..");
        return pension;
    }
   public static void main(String[] args) throws ClassNotFoundException {
       System.out.println("start of main.........");
    ThrowsExample example = new ThrowsExample();

//    int d1 = example.getPension(30,1000);
//       System.out.println("Total pension "+d1);

//    try{
//        int pen = example.getPension(10,1000);
//    }catch (ArithmeticException ae){
//        System.out.println(ae.getMessage());
//    }

//       try{
//           int pen = example.getPension(10,1000);
//       }catch (ClassNotFoundException cfe){
//           System.out.println(cfe.getMessage());
//       }
       int pen = example.getPension(10,1000);
       throw new ClassNotFoundException("Throw to its own caller");
//       System.out.println("End of main.....");
    }
}
