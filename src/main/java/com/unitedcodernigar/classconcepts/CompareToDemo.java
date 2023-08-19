package com.unitedcodernigar.classconcepts;

import java.util.*;

public class CompareToDemo {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(10,100,20,80,40,300);
        List<String> list2 = Arrays.asList("Name","Age","Salary","Department");
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println("--------------------2--------------");
        Collections.reverse(list1);
        Collections.reverse(list2);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println("----------------------------2---------------------------");

        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee("Mike","01","HR",3000,28);
        Employee employee2 = new Employee("Tom","03","IT",5000,25);
        Employee employee3 = new Employee("David","05","Global IT",6000,35);
        Employee employee4 = new Employee("Lara","08","Devops",4000,32);

        employeeList.addAll(Arrays.asList(employee1,employee2,employee3,employee4));
//        employeeList.sort(Comparator.comparing(Employee::getAge));
//        System.out.println(employeeList);
//        System.out.println();
//        employeeList.sort(Comparator.comparing(Employee::getEmployeeName));
//        System.out.println(employeeList);
//        System.out.println();
//        employeeList.sort(Comparator.comparing(Employee::getSalary));
//        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        System.out.println();
        employeeList.sort(Comparator.comparing(Employee::getSalary).reversed());
        System.out.println(employeeList);
    }
}
