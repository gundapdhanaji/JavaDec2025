package Java_Basics.ms;

public class TypeConversion {
    public static void main(String[] args) {
        byte b= 10;
        int x= b; // implicit type conversion
//        byte c = x; //CT error assign var to var (int to byte) not value
        System.out.println(x);

        int x1 = 10;
        float y1 = x1; // implicit float is bigger than int

        int i = (int) y1; //explicit convert float to int


    }

}
