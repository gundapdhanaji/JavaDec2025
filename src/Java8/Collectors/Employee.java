package Java8.Collectors;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        //Query 3.1 : How many male and female employees are there in the organization?
        Map<String,  Long> noOfMaleandFemaleEmployees =  employeeList.stream().
                            collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        //Query 3.2 : Print the name of all departments in the organization?
        System.out.println(noOfMaleandFemaleEmployees);
        System.out.println("Departments in the organisation ");
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        List<String> deptName = employeeList.stream()
                .map(Employee::getDepartment)
                .distinct().collect(Collectors.toList());
        System.out.println(deptName );

//        Query 3.3 : What is the average age of male and female employees?
//       Map<String,Double> avgAgeOfMaleFemale = employeeList.stream().map(Employee::getGender,Collectors.averagingInt(Employee::getAge));
       Map<String, Double> avgAgeOfMaleFemale =  employeeList.stream()
               .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println("Average age of Male and Female "+avgAgeOfMaleFemale);
    /*
    Query 3.4 : Get the details of highest paid employee in the organization?
    Use Collectors.maxBy() method which returns maximum element wrapped in an Optional
    object based on supplied Comparator.*/

//    Optional<Employee> highestSalaryPaidEmployee = employeeList.stream()
//         .max((a,b)-> (int) (a.getSalary() - b.getSalary())); here we use lambda but we cant use get method
    /*
    Optional<Employee> highestPaidEmployeeWrapper=
    employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
    Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
    System.out.println("Details Of Highest Paid Employee : ");
    System.out.println("==================================");
    System.out.println("ID : "+highestPaidEmployee.getId());
    System.out.println("Name : "+highestPaidEmployee.getName());
    System.out.println("Age : "+highestPaidEmployee.getAge())*/
    /*
    * Query 3.5 : Get the names of all employees who have joined after 2015?
      For such queries which require filtering of input elements, use Stream.filter() method which filters
      * input elements according to supplied Predicate.*/
        System.out.println("Employees whose joining after 2015 : ");
//    employeeList.stream().map(Employee::getYearOfJoining)
//                .filter(ofJoining -> ofJoining > 2015).forEach(System.out::println);
     employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2015)
             .map(Employee::getName).forEach(System.out::println);

    /*Query 3.6 : Count the number of employees in each department? */

     Map<String,Long> DeptWiseEmpCount = employeeList.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(DeptWiseEmpCount);

    /*Query 3.7 : What is the average salary of each department?
    Use the same method as in the above query 3.6, but here pass Collectors.averagingDouble(Employee::getSalary)
    as second argument to Collectors.groupingBy() method.*/
        System.out.println("Average Salary of Each Department : ");
     Map<String, Double> avgSalEachDept = employeeList.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalEachDept);

     Set<Map.Entry<String, Double>> entrySet = avgSalEachDept.entrySet();

     for (Map.Entry<String, Double> entry : entrySet){
         System.out.println(entry.getKey() + " : "+entry.getValue());
     }
//    Query 3.8 : Get the details of youngest male employee in the product development department?\
        Optional<Employee> youngestMaleEmpProdDev =  employeeList.stream()
                .filter(employee -> employee.department == "Product Development" && employee.gender=="Male")
                .min(Comparator.comparingInt(Employee::getAge));
        System.out.println("Youngest Male Employee in Product Development : ");
        System.out.println(youngestMaleEmpProdDev);

        /*Query 3.9 : Who has the most working experience in the organization?
        For this query, sort employeeList by yearOfJoining in natural order and first employee will have most working
        experience in the organization. To solve this query, we will be using sorted() and findFirst() methods of Stream.*/
        Optional<Employee> seniorEmployee =
        employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

        System.out.println("Most working employee in the organization ; "+seniorEmployee.get());

        /*
        * Query 3.10 : How many male and female employees are there in the sales and marketing team?
         This query is same as query 3.1, but here use filter() method to filter sales and marketing employees.*/
       Map<String, Long> maleFemaleEmpInSalesAndMarkdept =  employeeList.stream()
               .filter(employee -> employee.getDepartment() == "Sales And Marketing")
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(maleFemaleEmpInSalesAndMarkdept);

//        Query 3.11 : What is the average salary of male and female employees?
    /*
        This query is same as query 3.3 where you have found average age of male and female employees.
        Here, we will be finding average salary of male and female employees.
    * */
       Map<String, Double> avgSalMaleAndFemale = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Average Salary Of Male and Female "+avgSalMaleAndFemale);

       //Query 3.12 : List down the names of all employees in each department?
        System.out.println("All Employees in Each Department : ");
//       employeeList.stream().map(Employee::getName).forEach(System.out::println);

       Map<String,List<Employee>> empInEachDept =  employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
      Set<Map.Entry<String, List<Employee>>> entries =  empInEachDept.entrySet();
        System.out.println(" ------------------------------------------------- ");
      for (Map.Entry<String,List<Employee>> listEntry : entries){
          System.out.println("Employees In "+listEntry.getKey() + " ");

          System.out.println(" -------------------------------------- ");
          List<Employee> list = listEntry.getValue();
          for (Employee  emp : list)
              System.out.println(emp.getName());
      }

        /*Query 3.13 : What is the average salary and total salary of the whole organization?
        For this query, we use Collectors.summarizingDouble() on Employee::getSalary which
        will return statistics of the employee salary like max, min, average and total.*/

      DoubleSummaryStatistics empSalaryStatistics =  employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Average Salary "+empSalaryStatistics.getAverage());

        System.out.println("Total Salary "+empSalaryStatistics.getSum());


    /*
    * Query 3.14 : Separate the employees who are younger or equal to 25 years from those employees who
    * are older than 25 years.
    For this query, we will be using Collectors.partitioningBy() method which separates input
    * elements based on supplied Predicate.*/
      Map<Boolean,List<Employee>> partitioningByAge =  employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));

        System.out.println(partitioningByAge);

        Set<Map.Entry<Boolean, List<Employee>>> entrySet2 = partitioningByAge.entrySet();
        for (Map.Entry<Boolean, List<Employee>> entry : entrySet2)
        {
            System.out.println("-----------------------------------");
            if (entry.getKey()){
                System.out.println("Employees Older than 25 years");
            }else {
                System.out.println("Employees Younger than or Equal to 25");
            }
            System.out.println("------------------------------------------");
            List<Employee> list = entry.getValue();
            for (Employee e : list){
                System.out.print(e.getName() +" ");
            }
        }

    }

}
