package com.janaina.w3s.modfiers;

// create an abstract class
abstract class Main {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // create an abstract method
}

// create a subclass that inherits from Main
class Student extends Main {
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}