package com.janaina.w3s.others;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    // display the current local date and time
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println("Before formatting: " + date);
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("E, dd MMM yyyy | HH:mm:ss");

        String formattedDate = date.format(formatObj);
        System.out.println("After Formatting: " + formattedDate);
    }
}
