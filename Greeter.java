
public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        // Since the greet method accepts an instance of Greeting
        // and the function () -> System.out.println("Hello World") can be treated as a value
        // then the lambda expression can be passed as an argument
        // if the lambda expression's signature matches that of the instance it derives from
        // (in this case: the signature matches the signature of Greeter's perform method
        greeter.greet(() -> System.out.println("Hello World"));
    }
}
