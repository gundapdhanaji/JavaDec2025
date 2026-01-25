package AccessModifier.P1;

// Same Package SubClass
public class SubClass extends PackageP1PublicClass {

    public static void main(String[] args) {
        SubClass subClassObj = new SubClass();
        subClassObj.defaultVariableP1=10; //default methods and variables are accessible
        subClassObj.defaultMethodP1();
        subClassObj.protectedVariableP1=20;  //protected methods and variables are accessible
        subClassObj.publicVariableP1 = 30;    //public methods and variables are accessible

        //In same pkg subclass private members are not allowed
    }
}
