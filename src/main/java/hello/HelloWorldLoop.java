public class HelloWorldLoop {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting HelloWorld loop. Press Ctrl+C to stop the process.");
        while (true) {
            System.out.println("Hello, World!");
            Thread.sleep(5000); // Print every 5 seconds
        }
    }
}
