package com.unitedcodernigar.lambdaandstream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {

        List<PersonN> people = new ArrayList<>();
        people.add(new PersonN("Abdullah",23));
        people.add(new PersonN("Adil",30));
        people.add(new PersonN("Bill Gates",26));

        // this way is start whit list
        people.stream().sorted(Comparator.comparing(personN -> personN.getAge()));
        System.out.println(people);
        System.out.println();

        // this way is start whit age
        List<PersonN> sortedList = people.stream().sorted(Comparator.comparing(personN -> personN.getAge())).
                collect(Collectors.toList());
        System.out.println(sortedList);
    }
}

class PersonN {
    private String name;
    private int age;
    public PersonN(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonN{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}