package org.example.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueDemo {
    public static void main (String[] args) {

        Deque<Character> stack = new ArrayDeque<>();
        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.push('D');
        stack.push('E');

        stack.forEach(System.out::println);

        System.out.println("*********************");
        System.out.println(stack.peek());
        System.out.println(stack.pop());


    }

}
