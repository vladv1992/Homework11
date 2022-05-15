package ro.fasttrackit.homework.lab11;

import java.util.HashSet;
import java.util.Set;

public class Bouquet {

    public static void main(String[] args) {
        Set<String> bouquet = new HashSet<>();

        bouquet.add("margareta");
        bouquet.add("lalea");
        bouquet.add("crin");
        bouquet.add("lavanda");
        bouquet.add("brandusa");
        System.out.println("buchetul de flori contine urmatoare flori: " + bouquet);

        bouquet.remove("lalea");
        System.out.println("Florile ramase din buchet" + bouquet);

    }
}


