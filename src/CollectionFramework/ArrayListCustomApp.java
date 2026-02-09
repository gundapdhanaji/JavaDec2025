package CollectionFramework;

public class ArrayListCustomApp {

    public static void main(String[] args) {
        ArrayListCustom<Integer> list = new ArrayListCustom<Integer>();

        //Add elements in custom ArrayList

        list.add(1);
        list.add(7);
        list.add(4);
        list.add(8);
        list.add(5);
        list.add(6);

        //Display custom ArrayList
        list.display();

        System.out.println("\n element at 1 index in custom ArrayList "+list.get(1));

        System.out.println("Remove element at 2 index from an array "+ list.remove(2));

        list.display();
    }
}
