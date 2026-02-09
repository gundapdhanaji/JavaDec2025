package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapDuplicateKeys {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(100,"Java");
        System.out.println("get values from map1 "+map.get(100));

        map.put(100,"Java"); map.put(100,"Language");
        System.out.println("get values from map2 "+map.get(100));

        System.out.println("Size of map "+map.size());
    }
}
