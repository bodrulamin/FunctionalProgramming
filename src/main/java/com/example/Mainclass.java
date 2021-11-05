package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Mainclass {

    static class Person {
        public final String name;
        public final Integer age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Car {
        public final String make;
        public final String color;
        public final float price;

        public Car(String make, String color, float price) {
            this.make = make;
            this.color = color;
            this.price = price;
        }
    }


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

        Person[] peopleArr = {
                new Person("brandon", 23),
                new Person("bodrul", 25),
                new Person("hallil", 43),
                new Person("Mehedi", 27)
        };

        List<Person> people = new ArrayList<>(Arrays.asList(peopleArr));

// Get a list that contains all the people's names
        List<String> names = people
                .stream()
                .map(person -> person.name)
                .collect(Collectors.toList());

        System.out.println(names);


        Car[] carsArr = {
                new Car("Chevy", "red", 1000f),
                new Car("Ford", "blue", 1000f),
                new Car("Toyota", "grey", 1000f),
                new Car("Toyota", "blue", 1000f)
        };


        List<Car> cars = new ArrayList<>(Arrays.asList(carsArr));
// Get a list of blue cars

        List<Car> blueCars = cars
                .stream()
                .filter(car -> car.color.equals("blue"))
                .collect(Collectors.toList());

        System.out.println(blueCars.stream().map(car -> car.make).collect(Collectors.toList()));

        Employee[] employeesArr = {
                new Employee("John", 43, "Developer", 1f),
                new Employee("Hannah", 43, "Dev", 1f),
                new Employee("Bart", 43, "Sales", 1f),
                new Employee("Sophie", 43, "Dev", 1f)
        };


        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

// Get a sum of employees salary

     Float salSum = employees
                .stream()
                .map(employee -> employee.salary)
                .reduce(0f, (x,y) -> x+y);

        System.out.println(salSum);


    }
}
