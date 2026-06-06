package CollectionFramework.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class IntroComparableSorting {

    static class Employee implements Comparable<Employee>{
        private int empId;
        private String name;
        private int age;
        private double salary;
        private String address;

        public Employee() {
        }

        public Employee(int empId, String name, int age, double salary, String address) {
            this.empId = empId;
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.address = address;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "empId=" + empId +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    ", address='" + address + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Employee o) {

            return this.empId - o.empId;
        }
    }
    public static void main(String[] args) {

        Employee emp1 = new Employee(101,"Nikhil",26,80000,"Kadegav");
        Employee emp2 = new Employee(110,"Dhanaji",23,80000,"Kadegav");
        Employee emp3 = new Employee(105,"Ganga",22,80000,"Kadegav");
        Employee emp4 = new Employee(125,"Akash",27,80000,"Kadegav");
        Employee emp5 = new Employee(115,"Sudarshan",24,80000,"Kadegav");
        Employee emp6 = new Employee(130,"Sumit",21,80000,"Kadegav");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);

        System.out.println("Before sorting \n"+employeeList);

        Collections.sort(employeeList);
        System.out.println("After sorting \n"+employeeList);

    }
}
