package OOPS.Inheritance;


class GreatGrandParentClass{
    public void greatGrandParentProperty(){
        System.out.println("Property of Great Grand Parent");
    }
    public void greatGrandParentProperty2(){
        System.out.println("Property of Great Grand Parent 2");
    }

    public void greatGrandParentProperty3(){
        System.out.println("Property of Great Grand Parent 3");
    }
}
class GrandParentClass extends  GreatGrandParentClass{
    public  void grandParentProperty(){
        System.out.println("Property of Grand Parent ");
    }
    public  void grandParentProperty2(){
        System.out.println("Property of Grand Parent 2 ");
    }
}

class ParentClass {
    public  void parentProperty(){
        System.out.println("Property of Parent ");
    }
}
class ChildClass extends ParentClass{
    public void childProperty(){
        System.out.println("Child Property");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        // childClass obj has access 2 methods one its own and one from Its SuperClass
        ChildClass childClassObj = new ChildClass();
        childClassObj.childProperty();
        childClassObj.parentProperty();

        //here grandClassObj has access 5 methods two its own and 3 from its Super class
        GrandParentClass grandClassObj = new GrandParentClass();
        grandClassObj.grandParentProperty();
        grandClassObj.grandParentProperty2();
        grandClassObj.greatGrandParentProperty3();
        grandClassObj.grandParentProperty();
        grandClassObj.greatGrandParentProperty3();

    }
}
