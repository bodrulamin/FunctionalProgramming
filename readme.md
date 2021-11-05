# Functional Programming Excercise

```
// Get a list that contains all the people's names
    List<String> names = people
                .stream()
                .map(person -> person.name)
                .collect(Collectors.toList());

    System.out.println(names);
```

```
// Get a list of blue cars
    List<Car> blueCars = cars
                .stream()
                .filter(car -> car.color.equals("blue"))
                .collect(Collectors.toList());
```

``` 

// Get a sum of employees salary

     Float salSum = employees
                .stream()
                .map(employee -> employee.salary)
                .reduce(0f, (x,y) -> x+y); //.reduce(0f, Float::sum);

     System.out.println(salSum);




```