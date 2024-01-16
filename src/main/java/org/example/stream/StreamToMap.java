package org.example.stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToMap {

    public static void main(String[] args){
        String input = "Geeks for Geek";

        Map<String, Integer> map = Stream.of(input.split(" ")).collect(Collectors.toMap(value->value, value->value.length()));

        System.out.println("Map **** " + map);


    }

}
