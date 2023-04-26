package com.janaina.w3s.abstraction;

abstract class Animal {
    // using the same example from inheritance, now we are using abstract classes and methods.
    public abstract void animalSound(); // abstract method doesn't have a body
    public void sleep() {
        System.out.println("To mimir... Zzzzzz"); // regular method has a body
    }
}

class Pig extends Animal { // subclass inherit from Animal
    public void animalSound(){
        System.out.println("The pig says: oink oink"); // the body of animalSound() is provided here
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // create a pig object
        myPig.animalSound();
        myPig.sleep();
    }
}