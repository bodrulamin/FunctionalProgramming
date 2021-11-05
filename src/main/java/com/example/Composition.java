package com.example;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Composition {





    static class Employee {
        public final String name;
        public final Integer age;
        public final String jobTitle;
        public final Float salary;

        public Employee(String name, int age, String jobTitle, Float salary) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

    }

    public static void main(String[] args) {



        Function<Integer,Integer> timesTwo = x -> x*2;
        Function<Integer,Integer> minusOne  = x -> x-1;

       Function<Integer,Integer>  timesTwoMinusOne = minusOne.compose(timesTwo);

        System.out.println("compose " + timesTwoMinusOne.apply(3));



        Employee[] employeesArr = getEmployees();
        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

        // reverse and uppercase the employee names
        Function<Employee,String> getName = e -> e.name;
        Function<String,String> reverse = e -> new StringBuilder(e).reverse().toString();
        Function<String,String> upperCase = e -> e.toUpperCase();
        Function<Employee, String> getReversedUppercaseName = getName.andThen(reverse).andThen(upperCase);

        List<String > results = employees
                .stream()
                .map(getReversedUppercaseName)
                .collect(Collectors.toList());

        System.out.println(results);

    }

    private static Employee[] getEmployees() {



        Employee[] employeesArr = {
                new Employee("John", 43, "Dev", 12f),
                new Employee("Hannah", 43, "Dev", 1f),
                new Employee("Bart", 43, "Sales", 13f),
                new Employee("Sophie", 43, "Dev", 1f)
        };
        return employeesArr;
    }


}
