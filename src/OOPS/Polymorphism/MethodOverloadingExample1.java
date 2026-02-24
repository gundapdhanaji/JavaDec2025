package OOPS.Polymorphism;

public class MethodOverloadingExample1 {
    public int add(int a, int b){
        return  a+b;
    }

    public double add(double a, double b, double c){
        return a+b+c;
    }

    public String concatenate(String str1, String str2){

        return str1+ " "+ str2;
    }
    public String concatenate(String str1, String str2, String str3){
        return str1 + " "+  str2 + " "+  str3;
    }
    public static void main(String[] args) {

        MethodOverloadingExample1 example1 = new MethodOverloadingExample1();
        int result = example1.add(10,20);
        double result1 = example1.add(11,12.5,14);
        System.out.println(result);
        System.out.println(result1);

        String twoParam = example1.concatenate("Dhanaji","Gundap");
        String threeParam = example1.concatenate("Dhanaji","Ananda","Gundap");

        System.out.println("Two parameter string "+twoParam);
        System.out.println("Three parameter string "+threeParam);
    }
}
