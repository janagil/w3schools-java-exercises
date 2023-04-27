package com.janaina.w3s.iterator;
import java.util.ArrayList;
import java.util.Iterator;

// use an iterator to remove numbers less than 10 from a collection
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(15);
        numbers.add(2);
        numbers.add(9);
        numbers.add(21);
        numbers.add(56);
        Iterator<Integer> it = numbers.iterator(); // get the iterator

        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
