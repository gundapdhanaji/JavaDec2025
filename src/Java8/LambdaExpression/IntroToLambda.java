package Java8.LambdaExpression;

@FunctionalInterface
interface LambdaInterface{
    void test(int a, String b);
    default  void show(){
        System.out.println("Default method in functional interface");
    }
}

class DD{
    public static void main(String[] args) {

        LambdaInterface dd = (int aaa, String bbb) ->{
            System.out.println("Two Parameters in a method "+aaa + " "+bbb);
        };
        dd.test(1000,"Dhanaji");
    }
}

interface DivideBy{
    double divide(int a, int b);
}
public class IntroToLambda {
    public static void main(String[] args) {
        LambdaInterface lambdaInterface = (int a, String name) -> {
            System.out.println("Test method Implemented "+" "+a + " "+name);
        };
        lambdaInterface.test(100,"Dhanaji");

//        DivideBy divide = ( a,  b)->{
//            if (b == 0)
//                throw new ArithmeticException("Can not be divide by zero ");
//            return a/b;
//        };
//        divide.divide(100,0);

        DivideBy divide1 = (c,d) ->{
        try {
            double f = c/d;

        }catch (ArithmeticException e){
            System.out.println("Exception is "+e.getCause());
        }
        return c/d;
        };
        System.out.println(divide1.divide(100,0));
    }
}

@FunctionalInterface
interface BBBB{
    int addition(int a, int b);
}
class AAAA{
    public static void main(String[] args) {
        BBBB bbbb = (int a, int b) ->{
            int c = a + b;
            System.out.println("Addition of 2 numbers : "+c);
            return c;
        };

    }
}