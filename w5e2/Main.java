package w5e2;

public class Main {
    public static void main(String[] args) {
        Producer myProducer = new Producer();
        Consumer myConsumer = new Consumer();
        myConsumer.start();
        myProducer.start();
    }
}
