
public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();

        // The greet method accepts a Greeting object
        // Then calls the Greeting object's perform method
        // In this case, the HelloWorldGreeting's perform method prints "Hello World!"
        greeter.greet(helloWorldGreeting);
    }
}
