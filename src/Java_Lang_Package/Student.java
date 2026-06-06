package Java_Lang_Package;

public class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString(){

        return "This is student with name : "+name +" and Role Number is "+rollNo;
    }
    public static void main(String[] args) {
        Student s = new Student("Dhanaji",101);
        Student s1 = new Student("Sambhaji",102);

        System.out.println(s.toString());
        System.out.println(s);
        System.out.println(s1.toString());
    }

}
