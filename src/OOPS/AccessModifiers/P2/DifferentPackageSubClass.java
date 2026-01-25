package AccessModifier.P2;

import AccessModifier.P1.PackageP1PublicClass;

public class DifferentPackageSubClass extends PackageP1PublicClass {

    // Access using PARENT OBJECT (IMPORTANT RULE)


    public static void main(String[] args) {
        PackageP1PublicClass diffPkgSbClssParent = new PackageP1PublicClass();
        diffPkgSbClssParent.publicVariableP1=100;


//        Java rule (very important):

//In a different package, a protected member can be accessed ONLY through inheritance,
//NOT through a parent class object reference.

        DifferentPackageSubClass diffPkgSbClssChild = new DifferentPackageSubClass();
        diffPkgSbClssChild.protectedVariableP1=50;
        diffPkgSbClssChild.protectedMethodP1();
    }
}
