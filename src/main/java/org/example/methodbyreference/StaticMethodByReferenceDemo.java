package org.example.methodbyreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticMethodByReferenceDemo {

    public static void main(String[] args){

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("vicky", 24));
        personList.add(new Person("poonam", 25));
        personList.add(new Person("sachin", 19));

        // Display message only
        System.out.println("Before Sorting Original List :");
        personList.stream().map(x->x.getName()).forEach(System.out::println);

        Collections.sort(personList, StaticMethodByReferenceDemo::compareByName);

        // Display message only
        System.out.println("Sort by name :");
        personList.stream().map(x->x.getName()).forEach(System.out::println);

        Collections.sort(personList, StaticMethodByReferenceDemo::compareByAge);
        // Display message only
        System.out.println("Sort by age :");
        personList.stream().map(x->x.getName()).forEach(System.out::println);


    }

    public static int compareByName(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }

    public static int compareByAge(Person a, Person b){
        return a.getAge().compareTo(b.getAge());
    }

}
