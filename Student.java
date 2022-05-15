package ro.fasttrackit.homework.lab11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Student {
    public static void main(String[] args) {
        Map<String, Integer> catalog = new HashMap <>();
        catalog.put("Marius",4);
        catalog.put("Diana", 10);
        catalog.put("Elena", 10);
        catalog.put("Gheorghe", 10);
        catalog.put("Madalina", 10);
        catalog.put("Ioana", 10);


        System.out.println(catalog.values());
        System.out.println(new HashSet<Integer>(catalog.values()));
        System.out.println(the_firt_characte(catalog));
        System.out.println(catalog.toString());
    }
    public static Set<Character> the_firt_characte (Map<String, Integer> catalog){
         Set<Character> result = new HashSet<>();
        for(String c : catalog.keySet()){
            result.add(c.charAt(0));
        }
        return result;
    }
}
