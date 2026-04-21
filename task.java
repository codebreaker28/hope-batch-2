import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    String department;
    double salary;
    int age;

    Employee(String name, String department, double salary, int age) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

public class task {
    public static void main(String[] args) {

        // Java 8 way (instead of List.of)
        List<Employee> employees = Arrays.asList(
            new Employee("Alic", "dev", 60000, 25),
            new Employee("Balu", "HR", 40000, 30),
            new Employee("Caty", "dev", 70000, 28),
            new Employee("Den", "support", 30000, 35),
            new Employee("Eve", "dev", 45000, 22)
        );

        // filter
        List<Employee> filtered = employees.stream()
            .filter(e -> e.getDepartment().equals("dev"))
            .filter(e -> e.getSalary() > 50000)
            .collect(Collectors.toList()); // instead of toList()

        double totalSalary = filtered.stream()
            .mapToDouble(Employee::getSalary)
            .sum();

        double avgSalary = filtered.stream()
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0);

        long count = filtered.stream().count();

        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Average Salary: " + avgSalary);
        System.out.println("Count: " + count);
    }
}
