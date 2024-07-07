//class declarartion
// public: An access modifier that makes the class accessible from any other class.
// class: The keyword used to declare a class.
public class MainMethod {

    //Method declaration
    // void: The return type of the method, indicating it does not return any value.
    // printMessage: The name of the method. It should start with a lowercase letter.
    public void printMessage() {
        System.out.println("Hello, world!");
    }

    //main method
    // static: The keyword indicating that this method belongs to the class, rather than instances of it.
    // String[] args: The parameter passed to the method, an array of strings that stores command-line arguments.
    // Inside the main method, an object of the HelloWorld class is created, and the printMessage method is called.
    public static void main(String[] args) {
        //creating an object of the HelloWorld class
        MainMethod hello = new MainMethod();

        //calling the method 
        hello.printMessage();
    }
}
