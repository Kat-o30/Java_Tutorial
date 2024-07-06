//class declarartion
public class HelloWorld {

    //Method declaration
    public void printMessage() {
        system.out.println("Hello, world!");
    }

    //main method
    public static void main(String[] args) {
        //creating an object of the HelloWorld class
        HelloWorld hello = new HelloWorld();

        //calling the method 
        hello.printMessage();
    }
}