package org.example.methodbyreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstantMethodReferenceDemo {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("vicky", 24));
        personList.add(new Person("poonam", 25));
        personList.add(new Person("sachin", 19));

        ComparisionProvider comparisionProvider = new ComparisionProvider();

        // Display message only
        System.out.println("Before Sorting Original List :");
        personList.stream().map(x->x.getName()).forEach(System.out::println);

        Collections.sort(personList, comparisionProvider::compareByName);

        // Display message only
        System.out.println("Sort by name :");
        personList.stream().map(x->x.getName()).forEach(System.out::println);

        Collections.sort(personList, comparisionProvider::compareByAge);
        // Display message only
        System.out.println("Sort by age :");
        personList.stream().map(x->x.getName()).forEach(System.out::println);

        System.out.println("--------------------------------- ");

        List<String> person2List = new ArrayList<>();
        person2List.add("Vicky");
        person2List.add("veejay");
        person2List.add("poonam");
        person2List.add("sachin");

        System.out.println("Printing the original list :");
        person2List.forEach(System.out::println);

        System.out.println("After Sorting:");
        Collections.sort(person2List, String::compareToIgnoreCase);
        person2List.forEach(System.out::println);

        System.out.println("After Sorting:");
        Collections.sort(person2List, String::compareTo);
        person2List.forEach(System.out::println);



    }
}
