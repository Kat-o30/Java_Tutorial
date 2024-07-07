// 1. Instance Methods :

// Instance methods belong to an instance of a class. To call an instance method, you need to create an object of the class.
// Purpose: An instance method is a function defined inside a class that operates on instances of that class.
// Access: It has access to instance-specific data through the this keyword.
// Usage: It is called on an instance of the class.
// Typical Role: Performs operations related to the object, such as modifying or accessing the instance’s attributes.

// public class TypesOfMethods {
//     // Instance variable
//     String message = "Hi there!";
//     //Instance method
//     public void displyMessage() { 
//         System.out.println("Message : " + message);
//     }
//     public static void main(String[] args) {
//         // Creating an object of Greeting
//         TypesOfMethods greeting = new TypesOfMethods();
//         // Calling the instance method
//         greeting.displyMessage();
//     }
// }

// 2. Static Methods :

// Static methods belong to the class rather than any instance. They can be called without creating an object of the class.

// public class TypesOfMethods {
//     //static method
//     public static int add(int a , int b) { 
//         return a + b;
//     }
//     public static void main(String[] args) {
//         // Calling the static method
//         int sum = TypesOfMethods.add(5, 10);
//         System.out.println("Sum : "+sum);
//     }
// }

// 3. Constructor Methods :

// Constructors are special methods used to initialize objects. They are called when an object of a class is created.
// Purpose: A constructor is a special type of method used to initialize an instance of a class.
// Access: It sets up initial state or values for the new instance.
// Usage: It is automatically called when a new instance of the class is created using the new keyword.
// Typical Role: Sets up necessary properties or performs any startup tasks needed for the object

// public class TypesOfMethods {
//     // Instance variable
//     private String breed;
//     //constructor
//     public TypesOfMethods(String breed) {
//         this.breed = breed;
//     }
//     //Instance method
//     public void displayBreed() {
//         System.out.println("Breed : " + breed);
//     }
//     public static void main(String[] args) {
//         // Creating an object of TypesOfMethods (Dog)
//         TypesOfMethods dog = new TypesOfMethods("Bulldog");
//         // Calling the instance method
//         dog.displayBreed();
//     }
// }

// 4. Getter and Setter Methods :

// Getter and setter methods are used to access and update the value of a private variable.

// public class TypesOfMethods {

//     // Private instance variable
//     private String model;

//     //constructor
//     public TypesOfMethods(String model) {
//         this.model = model;
//     }

//     //Getter method
//     public String getModel() {
//         return model;
//     }

//     //Setter method
//     public void setModel(String model) {
//         this.model = model;
//     }

//     public static void main(String[] args) {
//         // Creating an object of Car
//         TypesOfMethods car = new TypesOfMethods("Tesla");
        
//         // Using getter method
//         System.out.println("Model: " + car.getModel());
        
//         // Using setter method
//         car.setModel("Ford");
//         System.out.println("Updated Model: " + car.getModel());
//     }
// }

