// Allows one class to inherit fields and methods from another class. The class that inherits is called the subclass or derived class, and the class being inherited from is the superclass or base class.

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof Woof");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Inherited method
        myDog.bark(); // Specific method of Dog
    }
}
