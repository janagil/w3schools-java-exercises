package com.janaina.w3s.hashmap;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        // create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // add keys and values (name and age)
        people.put("Tohru", 17);
        people.put("Momiji", 15);
        people.put("Kyo", 18);

        for (String i : people.keySet()) {
            System.out.println("Key (name): " + i + " | Value (age): " + people.get(i));
        }
    }
}
