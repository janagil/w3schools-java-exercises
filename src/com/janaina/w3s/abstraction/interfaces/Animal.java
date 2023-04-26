package com.janaina.w3s.abstraction.interfaces;

interface Animal {
    // using the same example once again, but this time using interfaces.
    public void animalSound(); // similar to abstract, interface methods doesn't have a body
    public void sleep();
}

class Pig implements Animal {
    // implements is similar to extends
    public void animalSound() {
        // the body of the method is provided here
        System.out.println("The pig says: oink oink");
    }
    public void sleep() {
        System.out.println("To mimir... Zzzzz");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // creating a pig object
        myPig.animalSound();
        myPig.sleep();
    }
}