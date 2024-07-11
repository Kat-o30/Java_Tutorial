// The ability of a single function or method to operate in different ways based on the object it is acting upon.
// Compile-time polymorphism (method overloading) and Runtime polymorphism (method overriding) are the two types of polymorphism in Java.

// Compile-time polymorphism
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}                                           

// Runtime polymorphism
class Animal {
    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof Woof");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.add(2, 3));
        System.out.println(math.add(2.5, 3.5));

        Animal myAnimal = new Dog();
        myAnimal.sound(); // This will call the Dog's sound method
    }
}
