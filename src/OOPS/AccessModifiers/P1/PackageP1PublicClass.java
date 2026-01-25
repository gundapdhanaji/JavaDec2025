package AccessModifier.P1;

public class PackageP1PublicClass {
    
    private int privateVariableP1;
    protected int protectedVariableP1;
    public int publicVariableP1;
    int defaultVariableP1;

    private void privateMethodP1(){
        System.out.println("private method of PackageP1PublicClass");
    }

    public void publicMethodP1(){
        System.out.println("public method of PackageP1PublicClass");
    }

    void defaultMethodP1(){
        System.out.println("default method of PackageP1PublicClass");
    }

    protected void protectedMethodP1(){
        System.out.println("protected method of PackageP1PublicClass");
    }
}
