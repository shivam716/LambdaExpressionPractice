
// Labels the interface as a Functional Interface
// Therefore it can only have 1 abstract method
// It is completely optional and not required for Lambda types
// But is good practice
@FunctionalInterface
public interface Greeting {
    public void perform();
}
