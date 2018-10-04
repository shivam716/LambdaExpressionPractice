
// Labels the interface as a Functional Interface
// Therefore it can only have 1 abstract method
// It is completely optional and not required for Lambda types
// But is good practice
// After jdk 1.8 we can now use default methods within in Functional interface with a condition that there must exist exactly one abstract method 
@FunctionalInterface
public interface Greeting {
    public void perform();
}
