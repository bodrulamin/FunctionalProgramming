# Functional Programming Excercise

## 1. Get a list that contains all the people's names
<details>
<summary>Expand / collapse</summary>

```
// Get a list that contains all the people's names
    List<String> names = people
                .stream()
                .map(person -> person.name)
                .collect(Collectors.toList());

    System.out.println(names);
```

</details>


## 2. Get a list of blue cars
<details>
<summary>Expand / collapse</summary>



```
// Get a list of blue cars
    List<Car> blueCars = cars
                .stream()
                .filter(car -> car.color.equals("blue"))
                .collect(Collectors.toList());
```

</details>



## 3. Get a sum of employees salary
<details>
<summary>Expand / collapse</summary>


``` 

// Get a sum of employees salary

     Float salSum = employees
                .stream()
                .map(employee -> employee.salary)
                .reduce(0f, (x,y) -> x+y); //.reduce(0f, Float::sum);

     System.out.println(salSum);




```


</details>
