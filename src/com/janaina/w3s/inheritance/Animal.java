package com.janaina.w3s.inheritance;

public class Animal { // create a superclass (parent)
    protected String type = "cat"; // Animal attribute
    public void meow() { // Animal method
        System.out.println("Meooww!!");
    }
}

class Cat extends Animal { // create a subclass (child)
    private String catColor = "white"; // Cat attribute

    public static void main(String[] args) {
        // create a myCat object
        Cat myCat = new Cat();

        // call the meow() method from the animal class on the myCat object
        myCat.meow();

        // display the value of the type attribute (from the Animal class) and the value of the catColor from the Cat class
        System.out.println("Said the " + myCat.catColor + " " + myCat.type);
    }
}