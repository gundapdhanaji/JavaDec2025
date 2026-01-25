package OOPS.Inheritance;

//In Single inheritance child Class access the properties of Parent
class Mother{
    public void behaviourOfMother(){
        System.out.println("Behaviour of a Mother");
    }
}
class Child extends Mother{
    public void behaviourOfChild(){
        System.out.println("Behaviour of a Child");
    }
}
public class SingleInHeritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.behaviourOfChild();
        child.behaviourOfMother();
    }



}
