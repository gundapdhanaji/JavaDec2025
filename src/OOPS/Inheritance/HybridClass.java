package OOPS.Inheritance;

// A combination of two or more types of inheritance. except multiple inheritance.

class  GrandParent{
    public void propertyOfGP(){
        System.out.println("Property of Grand Parent");
    }
}
class WomanClass{
    public void behaviourOfWomen (){
        System.out.println("Behaviour of woman");
    }
}

class MenClass extends GrandParent{
    public void behaviourOfMen (){
        System.out.println("Behaviour of Men");
    }
}
class ChildClass1 extends MenClass{
    int rupees = 100;
    String property = "Own House";
    public void behaviourOfChild1 (){
//        super.behaviour();
        System.out.println("Behaviour of Child-1 like men");
    }

    @Override
    public String toString() {
        return "ChildClass1{" +
                "rupees=" + rupees +
                ", property='" + property + '\'' +
                '}';
    }
}
class ChildClass2 extends GrandParent{
    public void behaviourOfChild2 (){
        System.out.println("Behaviour of Child-2 like women");
    }
}

public class HybridClass {

    public static void main(String[] args) {

        ChildClass1 childClsObj = new ChildClass1();
        childClsObj.behaviourOfChild1();
        childClsObj.behaviourOfMen();
        childClsObj.propertyOfGP();
        System.out.println(" ================================= ");
        System.out.println("passing custom Class obj as a parameter "+childClsObj);
        MenClass menClsObj = new MenClass();
        menClsObj.behaviourOfMen();
        menClsObj.propertyOfGP();
        System.out.println("passing another class obj as a param "+menClsObj);


    }

}
