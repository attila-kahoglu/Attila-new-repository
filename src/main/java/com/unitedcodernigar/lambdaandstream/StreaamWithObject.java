package com.unitedcodernigar.lambdaandstream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreaamWithObject {
    public static void main(String[] args) {
        List<Employee> employees = getEmployee();
        // filter
        List<Employee> females = employees.stream().filter(employee -> employee.getGender().equals(Gender.FEMALE)).
                collect(Collectors.toList());
        females.forEach(System.out::println);
        System.out.println("---------------------sort--------------------");
        // Sort
        List<Employee> sort = employees.stream().sorted(Comparator.comparing(Employee::getAge)
                .reversed()).collect(Collectors.toList());
        sort.forEach(System.out::println);
        System.out.println("---------------------allMatch--------------------");
        // All match
        boolean allMatch = employees.stream().allMatch(employee -> employee.getAge() > 30 );
        System.out.println(allMatch);
        System.out.println("----------------------anyMatch--------------------");
        // AnyMatch
        boolean anyMatch = employees.stream().anyMatch(employee -> employee.getAge() > 30);
        System.out.println(anyMatch);
        System.out.println("----------------------noneMatch-------------------");
        // noneMatch
        boolean noneMatch = employees.stream().noneMatch(employee -> employee.getName().equals("Ale"));
        System.out.println(noneMatch);
        System.out.println("----------------------Max-------------------------");
        // Max
        employees.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
        System.out.println("----------------------Min-------------------------");
        // Min
        employees.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);


    }
    private static List<Employee> getEmployee(){
        return Arrays.asList(
                new Employee("Anna",25,Gender.FEMALE,1600),
                new Employee("Helen",40,Gender.FEMALE,2000),
                new Employee("Tom",35,Gender.MALE,1700),
                new Employee("Alex",30,Gender.MALE,3000));

    }
}
