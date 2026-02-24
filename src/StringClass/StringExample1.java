package StringClass;

public class StringExample1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String ("welcome");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2); //true
        System.out.println(str1 == str3); //false

        // 5 integer variables
        int [] marks = new int[5];
    }
}
