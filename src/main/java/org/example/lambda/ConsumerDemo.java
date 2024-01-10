package org.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args){

        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(100);

        Consumer<List<Integer>> modify = list -> {
            for(int i =0; i<list.size(); i++){
                list.set(i, list.get(i)*5);
            }
        };

        Consumer<List<Integer>> output = list -> {
            for(Integer data: list){
                System.out.println(data);
            }
        };

        Consumer<List<Integer>> output1 = list -> list.forEach(a -> System.out.println(a+1));

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);

        modify.accept(list);;
        output.accept(list);;
        output1.accept(list);
        System.out.println("1-----------------------------------------");
        output1.andThen(modify).accept(list);
        System.out.println("2-----------------------------------------");
        modify.andThen(output).andThen(output1).accept(list);

        System.out.println("-----------------------------------------");
        modify.andThen(output).andThen(null).accept(list);

    }
}
