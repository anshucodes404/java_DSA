package HashMaps;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //TreeMap<String, Integer> map = new TreeMap<>(); //treemap is used to store in sorted manner abstract will be same but internally different

        map.put("Anshu", 20); //key-value pairs
        map.put("Manash", 99);

        System.out.println(map.get("Anshu"));
        System.out.println(map.getOrDefault("Apurba", 67));
        System.out.println(map.containsKey("Apurba"));

        HashSet<Integer> set = new HashSet<Integer>();
        set.add(56);
        set.add(89);
        set.add(56);
        System.out.println(set);
    }
}
