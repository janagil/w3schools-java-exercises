package com.janaina.w3s.hashset;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        // create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // add values to the set
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        numbers.add(2);

        // show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println( i + " was FOUND in the set.");
            } else {
                System.out.println(i + " was NOT found in the set.");
            }
        }
    }
}
