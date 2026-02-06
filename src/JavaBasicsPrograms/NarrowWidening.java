package JavaBasicsPrograms;

public class NarrowWidening {

    public static void main(String[] args) {
        byte small = 10;

        double large = small; //implicit Casting Widening

        System.out.println("Print value "+large);

        double d = 123123123;

        int smallInt = (int)d;
    }
}
