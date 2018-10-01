
public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting helloWorldGreeting = new HelloWorldGreeting();

        // The interface type of the Lambda Expression may only contain one method
        // The lambda expression's signature must match the signature of the functional interface
        // Since both the lambda expression and the perform method in Greeting
        // are both void and does not accept any arguments, the lambda expression is valid.
        Greeting lambdaGreeting = () -> System.out.println("Hello World");

        // Inline implementation of an Interface
        // Also known as an Anonymous Inner Class
        Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.println("Hello World!");
            }
        };

        // This is how lambda expressions are executed.
        // By calling the interface method, it acts as if it were an instance of a class.
        innerClassGreeting.perform();
    }
}
