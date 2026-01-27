package OOPS.Interface;

interface A1{
     int a = 0;
    void  a1();
}

interface B1{
    int addition (int x, int y);
    void total();
}
//If one non-abstract class implements 1 or more interfaces,
//    then it's mandatory for that non-abstract child class to provide method implementation of
//    abstract methods of interfaces

public class OneClassImplementsMultipleInterface implements A1,B1 {
    @Override
    public void a1() {
        System.out.println(" A interface Method");
    }

    @Override
    public int addition(int x, int y) {
        int result;
        result = x+y;
        return result;
    }

    @Override
    public void total() {
        System.out.println("Total addition "+addition(10,20));
    }

    public static void main(String[] args) {
        OneClassImplementsMultipleInterface oneClsImplMulInfs = new OneClassImplementsMultipleInterface();
        oneClsImplMulInfs.a1();
        oneClsImplMulInfs.addition(20,30);
        oneClsImplMulInfs.total();
    }
}
