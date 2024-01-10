package org.example.methodbyreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ConstructorMethodByReferenceDemo {

    public static void main(String[] args){

        List<NewPerson> personList = getObjectList(20, NewPerson::new);

        personList.stream().map(x -> x.getName()).forEach(System.out::println);

    }

    public static <T> List<T> getObjectList(int length, Supplier<T> objectSupply) {

        List<T> list = new ArrayList<>();
        for(int i=0; i<length; i++)
            list.add(objectSupply.get());

        return list;
    }
}
