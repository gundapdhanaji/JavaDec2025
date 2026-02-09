package StringClass;

public class HowToSetValues {
    private String name;
    private int age;
    private double salary;
    private String address;

    public HowToSetValues() {
    }

    public HowToSetValues(String name1, int age1, double salary1, String address1) {
        this.name = name1;
        this.age = age1;
        this.salary = salary1;
        this.address = address1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "HowToSetValues{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        HowToSetValues obj1 = new HowToSetValues("Java",36,90000,"Pune");

        HowToSetValues obj2 = new HowToSetValues("Azure",32,95000,"Mumbai");

        HowToSetValues obj3 = new HowToSetValues();

        obj3.setName("Dhanaji");
        obj3.setAge(31);
        obj3.setSalary(105000);
        obj3.setAddress("Kolhapur");
    }
}
