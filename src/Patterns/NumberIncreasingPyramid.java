package Patterns;

public class NumberChangingPyramid {
    public static void main(String[] args) {
        int sum=6;
        for (int i = 1; i<sum; i++){
            for (int j=1; j<i; j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
        System.out.println();
    }
}
