
public class TypeInferenceExample {

    public static void main(String[] args) {
        // The lambda expression's value is the length of the String passed as an argument.
        StringLengthLambda myLambda = (String s) -> s.length();

        // However, because of TypeInferencing
        // The compiler can infer from the method in the interface StringLength Lambda
        // that the argument passed in is of type String
        // and thus can be removed from the lambda expression
        StringLengthLambda typeInferredLambda = (s) -> s.length();

        // Lastly, if there is only one input argument to the lambda expression
        // then the parenthesis can be omitted
        StringLengthLambda myTypeInferredLambda = s -> s.length();

        // myLambda's value = 12
        System.out.println(myLambda.getLength("Hello Lambda"));

        // typeInferredLambda's value = 11
        System.out.println(typeInferredLambda.getLength("Hello World"));

        // myTypeInferredLambda's value = 9
        System.out.println(myTypeInferredLambda.getLength("Josh Chen"));
    }

    interface StringLengthLambda {
        int getLength (String s);
    }
}
