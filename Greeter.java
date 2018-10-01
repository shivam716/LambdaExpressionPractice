
public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        // Inline implementation of an Interface
        // Also known as an Anonymous Inner Class
        Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.println("Hello World!");
            }
        };

        // Lambda expressions do the exact same thing as an Anonymous Inner Class
        Greeting lambdaGreeting = () -> System.out.println("Hello World");

        greeter.greet(innerClassGreeting);

        greeter.greet(lambdaGreeting);
    }
}
