package ro.fasttrackit.homework.lab11;


public class Person {
    private String name;
    private int age;
    private String color;
    private String hair;

    public Person(String name, int age, String color, String hair) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.hair = hair;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getHair() {
        return hair;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", hair='" + hair + '\'' +
                '}';
    }
}
