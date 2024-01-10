package org.example.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("Vijay");
        list.add("Ajay");
        list.add("Sankar");
/*
        Comparator<String> comparator = ( str1, str2) -> str1.compareTo(str2);

        Collections.sort(list, comparator);

        for(String name: list)
            System.out.println(name);*/

        list.stream().sorted().forEach(System.out::println);

    }
}
