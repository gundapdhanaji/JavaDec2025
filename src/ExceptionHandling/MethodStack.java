package ExceptionHandling;

public class MethodStack {
    public static void main(String[] args) {
        System.out.println("Inside main method");
        a();
    }
    static void  a(){
        System.out.println("Inside a() method");
        b();
    }
    static void  b(){
        System.out.println("Inside b() method");
        c();
    }
    static void  c(){
        System.out.println("Inside c() method");
        d();
    }
    static void  d(){
        System.out.println("Inside d() method");
        c();
    }
}
