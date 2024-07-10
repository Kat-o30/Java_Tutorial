// Class: A blueprint for creating objects. It defines a datatype by bundling data and methods that operate on the data into one single unit.
// Object: An instance of a class. It is a real-world entity that has state and behavior defined by its class.

class Dog {
    String breed;
    int age;
    String color;

    void barking() {
        System.out.println("Woof Woof");
    }
}

public class ClassesObjects {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.breed = "Labrador";
        myDog.age = 5;
        myDog.color = "Black";
        myDog.barking();
    }
}
