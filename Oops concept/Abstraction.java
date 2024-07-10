// The concept of hiding the complex implementation details and showing only the essential features of the object. This can be achieved using abstract classes and interfaces.

abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof Woof");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
        myDog.eat();
    }
}
