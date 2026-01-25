package AccessModifier.P2;

import AccessModifier.P1.PackageP1PublicClass;

public class PackageP2PublicClass extends PackageP1PublicClass {

    private int privateVariable;
    protected int protectedVariable;
    public int publicVariable;
    int defaultVariable;

    private void privateMethod(){
        System.out.println("private method of PackageP2PublicClass");
    }

    public void publicMethod(){
        System.out.println("public method of PackageP2PublicClass");
    }

    void defaultMethod(){
        System.out.println("default method of PackageP2PublicClass");
    }

    protected void protectedMethod(){
        System.out.println("protected method of PackageP2PublicClass");
    }

    public static void main(String[] args) {
//        PackageP2PublicClass obj = new PackageP2PublicClass();
        PackageP1PublicClass obj2 = new PackageP1PublicClass();

        PackageP2PublicClass child = new PackageP2PublicClass();
        child.protectedVariableP1=100;
        child.protectedMethodP1();
    }



}
