package OOPS.Inheritance;

class JavaParentClass {
    void parentClassMethod(){
        System.out.println("Method of Parent Class");
    }
}
public class IntroToInheritance extends JavaParentClass {

   void childClassMethod(){
       System.out.println("Method of Child Class");

   }

    public static void main(String[] args) {
        IntroToInheritance obj = new IntroToInheritance();
        obj.parentClassMethod();
        //here using childClass Object we can call parent Class method because we extend ParentClass in a child class

        JavaParentClass parentClass = new JavaParentClass();
//        parentClass.childClassMethod();
        //here we cannot call childClass method using parentClas Object
        parentClass.parentClassMethod();
        //but we call parentClass methods

//        IntroToInheritance childRef = new JavaParentClass(); // not possible
        JavaParentClass jparentRef = new IntroToInheritance();
        jparentRef.parentClassMethod();
//        jparentRef.childClassMethod(); //not possible
    }
}

class ABCD {
    public static void main(String[] args) {
        IntroToInheritance childClassObj = new IntroToInheritance(); //ChildClass Object & ChildClass reference
        childClassObj.parentClassMethod();//we call parentClassMethods using childClass Object because childClass extends ParentClass

        JavaParentClass parentClassObj = new JavaParentClass(); //ParentClass Object & parentClass reference
        parentClassObj.parentClassMethod();
//        parentClassObj.childClassMethod();  //parentClass ref & parentClass Object we can not access childClass methods
        //we can not call ChildClass methods using parent Class Object because It is not accessible
        //like child's property can not access parents




    }
}
