package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class StreamCustomFilteringDemo {

    public static void main(String[] args){

        List<Employee> myList = Arrays.asList(
                new Employee("Ram", 25),
                new Employee("Kumar", 40),
                new Employee("Rakesh", 35));

        myList.stream().filter(x->x.age >= 35).forEach(System.out::println);

    }

}
