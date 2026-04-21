import java.util.*;
import java.util.stream.*;
class Employee{
    String name;
    int salary;
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }       

}

public class Streamsexample {
    public static void main(String[] args) {
        /*List<Integer> numbs = Arrays.asList(2, 3, 4, 5, 6);

        List<Integer> multiplyBy2 = numbs.stream()
                                         .map(i -> i * 2)
                                         .collect(Collectors.toList());

        System.out.println(multiplyBy2);*/
        //obj
        List<Employee> employees = (List<Employee>) Arrays.asList(
            new Employee("Alice", 50000),
            new Employee("Bob", 60000),
            new Employee("Charlie", 55000)
        );  
        List<String> employeeNames = employees.stream()
                                              .map(Employee::getName)
                                              .collect(Collectors.toList());
        System.out.println(employeeNames);
        List<Integer> employeeSalaries = employees.stream()
                                                 .map(Employee::getSalary)
                                                 .collect(Collectors.toList());
        System.out.println(employeeSalaries);
        System.out.println(employees);

    }
}
