package az.edu.turing.module3.practice;


import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();

        list.add("apple");
        list.add("apple"); // ✅ Allowed — lists can have duplicates

        set.add("apple");
        set.add("apple"); // ❌ Ignored — sets store only unique elements

        map.put("apple", 1);
        map.put("apple", 2); // ✅ Replaces value — keys must be unique

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Map: " + map);
    }
}

