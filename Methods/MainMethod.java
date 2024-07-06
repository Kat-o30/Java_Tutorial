//class declarartion

// public: An access modifier that makes the class accessible from any other class.
// class: The keyword used to declare a class.
// HelloWorld: The name of the class. It should start with an uppercase letter.
public class MainMethod {

    //Method declaration
    // public: An access modifier that makes the method accessible from any other class.
    // void: The return type of the method, indicating it does not return any value.
    // printMessage: The name of the method. It should start with a lowercase letter.
    // System.out.println("Hello, World!");: This statement prints "Hello, World!" to the console.
    public void printMessage() {
        System.out.println("Hello, world!");
    }

    //main method
    public static void main(String[] args) {
        //creating an object of the HelloWorld class
        MainMethod hello = new MainMethod();

        //calling the method 
        hello.printMessage();
    }
}
