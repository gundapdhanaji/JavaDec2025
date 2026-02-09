package CollectionFramework;

import java.util.Arrays;

class Employee{
    int empId;
    String employeeName;
    String department;
    String designation;

    public Employee(int empId, String employeeName, String department, String designation) {
        this.empId = empId;
        this.employeeName = employeeName;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}

public class CustomArrayList<E> {

    private final static int INITIAL_SIZE = 10;
    private Object[] elementData = {};
    private int size; //default size 0


    public CustomArrayList() {
        this.elementData = new Object[INITIAL_SIZE];
    }

    public void add(E element){
        if (size == elementData.length){
            ensureCapacity();
        }

        elementData[size++] = element;
        System.out.println("elements present in element data "+elementData);
    }

    private void ensureCapacity(){
        int newSize = elementData.length +(elementData.length / 2);
        elementData = Arrays.copyOf(elementData,newSize);

    }

    public void display(){
        System.out.println("All Students List : ");
        if (size <= 0){
            System.out.println("Empty List 0");
            return;
        }

        for (int i=0; i<size; i++){
            System.out.println(elementData[i]+" ");
        }
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }


    public static void main(String[] args) {
        System.out.println("Custom ArrayList ");

        CustomArrayList customEmpList = new CustomArrayList();

        Employee emp1 = new Employee(1,"Dhanaji Gundap","Development", "Sr. Java Developer");
        Employee emp2 = new Employee(2,"Yogesh Bate","Quality Ass.", "Sr. QA");
        Employee emp3 = new Employee(3,"Pravin Patil","Marketing", "Sales Mgr");

        customEmpList.add(emp1);
        customEmpList.add(emp2);
        customEmpList.add(emp3);

        customEmpList.display();


    }
}
