package com.janaina.w3s.methods;
import java.util.Scanner;

public class Main {
    // creating a checkAge() method with if statement inside the method
    static void checkAge(int age){
        // if the age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied: You are not old enough!");

            // if age is greater than or equal to 18, print "access granted"
        } else {
            System.out.println("Access granted: You are old enough!");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert your age: ");
        int age = scan.nextInt();
        checkAge(age); // call the checkAge method and check the user input
    }
}
