
public class TypeInferenceExample {

    public static void main(String[] args) {

        // Type Inference
        // Since the argument of the printLambda method is of type StringLengthLambda
        // and the lambda expression signature matches that of getLength(String s) in the interface
        // The compiler infers the input argument type is, the return type is, etc.
        printLambda(s -> s.length());
    }

    public static void printLambda (StringLengthLambda l) {
        System.out.println(l.getLength("Hello Lambda"));
    }

    interface StringLengthLambda {
        int getLength (String s);
    }
}
