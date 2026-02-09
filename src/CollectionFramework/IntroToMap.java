package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class IntroToMap {

//    @Override
//    public int hashCode() {
//        return 100;
//    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(123,"Test");
        map.put(456,"Java");
        map.put(321,"ABCD");
        map.put(120,"DotNet");
        map.put(123,"PHP");
        map.put(125,"React");
        map.put(130,"Angular");
        map.put(140,"Html");
        map.put(200,"CSS");

//        System.out.println("Map size is "+map.size()); // 8
//        System.out.println("Map is Empty "+map.isEmpty()); //true
//        System.out.println("Map is Contains key "+map.containsKey("Java")); //false
//        System.out.println("Map is Contains key "+map.containsKey(123)); //true
//        System.out.println("Map contains value "+map.containsValue(500)); //false not specified value is not present in map
//        System.out.println("Map contains value "+map.containsValue("React")); // true specified value is present in map
//        System.out.println("Get values from map "+map.get(120)); //DotNet
//        System.out.println("Get values from map "+map.get(300)); //Null value not present at specified key
//        System.out.println("Removes Entry from map pass key return value "+map.remove(130)); //we pass key so return removed element(Object)
//        System.out.println("Removes Entry from map pass value return null "+map.remove("Java")); //we pass value  so return removed element(Object)
//        System.out.println("Removes Entry from map passing removed key return value "+map.remove(130));
//        System.out.println("size of map after removing element "+map.size());
//        System.out.println("Get All keys from map "+map.keySet());
//        System.out.println("Get All values from map "+map.values());



        IntroToMap obj = new IntroToMap();
//        IntroToMap obj = null;  // .NullPointerException
        int hash = obj.hashCode();
        System.out.println("HashCode of obj is "+hash); // 1149319664

        IntroToMap obj2 = new IntroToMap();
        int hash2 = obj2.hashCode();
        System.out.println("HashCode of obj2 is "+hash2);

        IntroToMap obj3 = new IntroToMap();
        int hash3 = obj3.hashCode();
        System.out.println("HashCode of obj3 is "+hash3);


    }
}
