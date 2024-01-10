package org.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSortedDemo {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(5, -10, 7, -18, 23);

        System.out.println("The sorted stream according "
                + "to provided Comparator is : ");

        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<String> arrayList = Arrays.asList("GeekD", "for",
                "BeeksforGeeks", "aeeksQuiz", "BFG");
        arrayList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        arrayList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("\nThe sorted stream is :");

        arrayList.stream().sorted((str1, str2) -> Character.compare(str1.charAt(str1.length()-1), str2.charAt(str2.length()-1))).forEach(System.out::println);


    }
}
