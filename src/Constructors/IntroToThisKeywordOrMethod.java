package Constructors;

public class IntroToThisKeywordOrMethod {
    public int roll;
    public String name;
    public String address;
    public int phoneNumber;

    public IntroToThisKeywordOrMethod() {
        this(101,"Dhanaji","Kolhapur",123456789);
        System.out.println("No argument constructor");
    }

    public IntroToThisKeywordOrMethod(int roll1, String name1) {
        this(105,"john","Doe");
        this.roll = roll1;
        this.name = name1;
        System.out.println("Two argument constructor");
        System.out.println("name : "+name1 + " roll "+ roll1);
    }

    public IntroToThisKeywordOrMethod(int roll3, String name3, String address3) {
        this.roll = roll3;
        this.name = name3;
        this.address = address3;

        System.out.println("Three argument constructor");
        System.out.println("name : "+name3 + " "+" roll3 "+roll3+ " address "+address3);
    }

    public IntroToThisKeywordOrMethod(int roll4, String name4, String address4, int phoneNumber4) {
            this(104,"Joe Root");
        this.roll = roll4;
        this.name = name4;
        this.address = address4;
        this.phoneNumber = phoneNumber4;
        System.out.println("Four Argument constructor ");
        System.out.println("roll4 "+roll4 + " name4 "+name4 + " address4 "+" phoneNumber4 "+phoneNumber4);
    }

    public static void main(String[] args) {
        IntroToThisKeywordOrMethod intro = new IntroToThisKeywordOrMethod();
    }
}
