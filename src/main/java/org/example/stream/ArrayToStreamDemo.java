package org.example.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStreamDemo {

    public static void main(String args[]){

        String array[] = { "Geeks", "forGeeks",
                "A Computer Portal" };

        System.out.println("Array : " + Arrays.toString(array));

        Stream<String> stream = convertArrayToStream(array);;

        System.out.println("Stream : " + Arrays.toString(stream.toArray()));

    }

    public static <T> Stream<T> convertArrayToStream(T array[]){
        return Stream.of(array);
//        return Arrays.stream(array);
    }
}
