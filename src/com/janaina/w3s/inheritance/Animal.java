package com.janaina.w3s.inheritance;

public class Animal {
    public void animalSound() {
        System.out.println("This animal makes a sound!");
    }
}

class Pig extends Animal {
    public void animalSound(){
        System.out.println("The pig says: oink oink");
    }
}
 class Cat extends Animal {
    public void animalSound(){
        System.out.println("The cat says: meow meow");
    }
 }

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myCat = new Cat();
        myAnimal.animalSound();
        myPig.animalSound();
        myCat.animalSound();
    }
}
