package ro.fasttrackit.homework.lab11;

public class Employee  extends Person{
    Integer salary;
    String company;

    public Employee(String name, int age, String color, String hair, int salary, String company) {
        super(name, age, color, hair);
        this.salary = salary;
        this.company = company;
    }
    public int getSalary(){
        return 0;

    }

    public String getCompany(){
        return null;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", company='" + company + '\'' +
                '}' + super.toString();
    }
}
