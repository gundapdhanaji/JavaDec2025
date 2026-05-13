package ExceptionHandling.sm;

import java.sql.SQLException;

public class ExceptionExample1 {

   public static void main(String[] args) {
        try{
            System.out.println(100/0);
        }
        catch (Exception e){
            System.out.println("RuntimeException Type of Exception in try block ");
            System.out.println(e instanceof SQLException); //false
            System.out.println(e instanceof RuntimeException); //true
            System.out.println("Inside Exp "+e);
        }
    }
}
