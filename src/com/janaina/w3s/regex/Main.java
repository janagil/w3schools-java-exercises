package com.janaina.w3s.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // creating a password
        Scanner scan = new Scanner(System.in);
        System.out.println("Define your new password: ");
        String passwordDefine = scan.nextLine();

        System.out.println("Insert your new password: ");
        String password = scan.nextLine();

        // use regular expressions to check if the password's correct
        Pattern pattern = Pattern.compile(password); // it is case-sensitive
        Matcher matcher = pattern.matcher(passwordDefine);
        boolean matchFound = matcher.find();


        if(matchFound) {
            System.out.println("Correct password. Logging in...");
        } else {
            System.out.println("Incorrect password. Try again");
        }
    }
}
