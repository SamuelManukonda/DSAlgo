package Interview;

import lombok.Builder;
import lombok.Data;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

// Coding problem regarding Java 8 Stream API.
// You have been given an employee list with EMP<Id, Name, Salary, Deptt>,
// find the highest salary of an employee from the HR department?
public class FindHighestSalaryOnEmployee {

    @Data
    @Builder
    static class Employee {
        private int id;
        private String name;
        private String department;
        private int salary;


    }

    public static void main(String[] args) {
        // Coding problem regarding Java 8 Stream API.
        // You have been given an employee list with EMP<Id, Name, Salary, Deptt>,
        // find the highest salary of an employee from the HR department?
        Employee emp1 = Employee.builder().id(1).name("Alex").salary(2000).department("IT").build();
        Employee emp2 = Employee.builder().id(1).name("Rexy").salary(5000).department("HR").build();
        Employee emp3 = Employee.builder().id(1).name("Sophie").salary(6000).department("HR").build();
        Employee emp4 = Employee.builder().id(1).name("Martin").salary(7000).department("IT").build();
        List<Employee> employeeList = List.of(emp1, emp2, emp3, emp4);

        Map<String, Employee> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(value -> value.salary)), Optional::get)));
        collect.entrySet().forEach(stringEmployeeEntry -> System.out.println(stringEmployeeEntry.getKey() + " " + stringEmployeeEntry.getValue()));
    }
}
