package ExceptionHandling.sm;

public class StringExample {
    public static void main(String[] args) {
        String s = new String("Durga");
        char  returnChar = s.charAt(1);

        String s2 = "Durga Soft";

        String s4 ="Durga";
        String s5 ="Durga1";
        System.out.println("s4 string literal hashcode.. "+s4.hashCode());
        System.out.println("s5 string literal hashcode.. "+s5.hashCode());

        System.out.println("equals method "+s4.equals(s5));
        System.out.println(s4.concat(s5));

        System.out.println("subString taking two index start and end-1 "+s2.substring(0,4));
        System.out.println(returnChar);
        System.out.println("length "+s.length());
    }
}
