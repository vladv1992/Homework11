package ro.fasttrackit.homework.lab11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {
    private List<Employee> employe;

    public Company(List<Employee> employe) {
        this.employe = new ArrayList<>(employe);
    }

    public List<Employee> salatyEmp(Integer limit) {
        List<Employee> result = new ArrayList<>();
        for (Employee e : employe) {
            if (limit < e.getSalary()) {
                result.add(e);
            }
        }
        return result;
    }

    public void extractPerson() {

        Map<String, Integer> p = new HashMap<>();

        p.put("Maria", 32);
        p.put("Mara", 32);
        for (String key : p.keySet()) {
            System.out.println(p.get(key));
        }
    }

    public int methodSalary() {
        int sum = 0;
        for (Employee e : employe) {
            sum += e.getSalary();

        }
        return sum;
    }

    public int biggestSalary() {
        int maxSalary = 0;
        for (Employee e : employe) {
            if (e.getSalary() < maxSalary) {

            }
        }

        return maxSalary;
    }
}