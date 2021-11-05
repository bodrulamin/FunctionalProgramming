# Functional Programming Excercise

```
// Get a list that contains all the people's names
List<String> names = people
.stream()
.map(person -> person.name)
.collect(Collectors.toList());

System.out.println(names);
```

