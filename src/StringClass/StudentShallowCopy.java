package StringClass;
import java.lang.Cloneable;

class Student implements Cloneable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override the protected clone() method and make it public
    @Override
    public Object clone() throws CloneNotSupportedException {
        // Calls the default Object class clone method, which does a shallow copy
        return super.clone();
    }
}

public class StudentShallowCopy {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "John Doe");
            // Clone the object
            Student s2 = (Student) s1.clone(); //here we typecast from object to Student

            System.out.println("Original: " + s1.id + " " + s1.name);
            System.out.println("Cloned: " + s2.id + " " + s2.name);

            // Verify they are different instances
            System.out.println("Are they different instances? " + (s1 != s2));

            // Modify the cloned object (String is immutable, so no issues with shallow copy)
            s2.name = "Jane Doe";
            System.out.println("\nAfter modifying cloned object's name:");
            System.out.println("Original: " + s1.id + " " + s1.name);
            System.out.println("Cloned: " + s2.id + " " + s2.name);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
