package org.example.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapToStreamDemo {

    public static void main(String[] args){

        Map<Integer, String> map = new HashMap<>();
        // Add entries to the Map
        map.put(1, "Geeks");
        map.put(2, "forGeeks");
        map.put(3, "A computer Portal");

        System.out.println("Map ** : " + map);

        Stream< Map.Entry<Integer, String>> entrySetStream = map.entrySet().stream();
//        System.out.println("Stream : " + entrySetStream.toArray());

        System.out.println("Entry Set Stream : " + Arrays.deepToString(entrySetStream.toArray()));

        Stream<Integer> keySetStream = map.keySet().stream().parallel();
        System.out.println("Key Set Stream    : " + Arrays.deepToString(keySetStream.toArray()));

        Stream<String> valueStream = map.values().stream().parallel();
        System.out.println("Values  Stream    : " + Arrays.deepToString(valueStream.toArray()));

    }
}
