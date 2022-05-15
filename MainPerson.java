package ro.fasttrackit.homework.lab11;

import java.util.*;

public class MainPerson {
    public static void main(String[] args) {
        List<Person> persones = new ArrayList<>();
        persones.add(new Person("Mariana",23,"red","blonde"));
        persones.add(new Person("Maria", 43,"blue","brown"));


        Map<String, Integer> map = new HashMap<>();
        for (Person person : persones){
            map.put(person.getName(), person.getAge());
            System.out.println(map);
        }
        Collections.sort(persones, new PersonComparator());
        System.out.println(persones);
    }



}
