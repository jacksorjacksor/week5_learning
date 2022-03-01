public class GreetingThreadTest {
    public static void main(String[] args) {
        // Create first thread:
        GreetingThread thread0 = new GreetingThread("G0");
        GreetingThread thread1 = new GreetingThread("G1");

        thread0.start();
        thread1.start();

    }
}
