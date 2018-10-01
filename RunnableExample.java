
public class RunnableExample {

    public static void main(String[] args) {
        // Anonymous inner class
        Thread myThread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });

        myThread.run();

        // Since Runnable has a single method and Lambda Expressions work like Anonymous Inner Classes
        // We can create a Lambda Expression for this thread

        Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
        myLambdaThread.run();
    }
}
