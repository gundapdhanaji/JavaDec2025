package OOPS.Inheritance;

class A {
    public void aClassMethod(){
        System.out.println("Method inside A class");
    }
    public void aClassMethod2(){
        System.out.println("Method 2 inside A class");
    }
    public void aClassMethod3(){
        System.out.println("Method 3 inside A class");
    }
}

class B {
    public void bClassMethod(){
        System.out.println("Method inside B class");
    }
    public void bClassMethod2(){
        System.out.println("Method inside A class method 2");
    }
}
class C extends A {
    public void cClassMethod(){
        System.out.println("Method inside C class");
    }
    public void cClassMethod2(){
        System.out.println("Method 2 inside C class");
    }
}
class D extends A {
    public void dClassMethod(){
        System.out.println("Method inside D class");
    }
}
//Hierarchical Inheritance means multiple subclasses extends from single parent class  and can access  methods from parent class
public class HierarchicalInheritance {
    public static void main(String[] args) {

        HierarchicalInheritance mainObj = new HierarchicalInheritance();
//        mainObj  //here we can't access methods from other classes
//        because there is no relationship between this class and other classes in this file

        //using C class Object we can access we can access 5 methods 2 from its own and 3 from Parent/Super Class
        C cobj = new C();
        cobj.aClassMethod();
        cobj.aClassMethod2();
        cobj.aClassMethod();
        cobj.cClassMethod();
        cobj.cClassMethod2();

        //using D class Object we can access we can access 4 methods 1 from its own and 3 from Parent/Super Class
        D dObj = new D();
        dObj.dClassMethod();
        dObj.aClassMethod();
        dObj.aClassMethod2();
        dObj.aClassMethod3();
    }
}
