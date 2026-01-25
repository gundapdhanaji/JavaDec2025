package AccessModifier.P1;

public class DefaultClass {
    private int privateVariable;
    protected int protectedVariable;
    public int publicVariable;
    int defaultVariable;

    public static void main(String[] args) {
        PackageP1PublicClass samePkNonSubClass = new PackageP1PublicClass();

        samePkNonSubClass.protectedVariableP1=20;
        samePkNonSubClass.defaultVariableP1=50;
        samePkNonSubClass.publicVariableP1=80;


    }
}
