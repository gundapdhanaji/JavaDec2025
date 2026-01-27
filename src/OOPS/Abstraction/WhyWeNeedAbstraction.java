package OOPS.Abstraction;


abstract  class WayOfEating{
     abstract void eat();
}

class IndianWayOfEating extends WayOfEating{

    @Override
    void eat() {
        System.out.println("Indian Peoples are use their hands for Eating");
    }
}

class WesternWayOfEating extends WayOfEating{
    @Override
    void eat() {
        System.out.println("Western Peoples use spoon/forks for eating");
    }
}

public class WhyWeNeedAbstraction {

    public static void main(String[] args) {

    }
}
