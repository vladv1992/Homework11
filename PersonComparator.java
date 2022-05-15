package ro.fasttrackit.homework.lab11;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Character.compare(
                o1.getName().charAt(o1.getName().length()-1),
                o2.getName().charAt(o2.getName().length()-1)
        );
    }
}
