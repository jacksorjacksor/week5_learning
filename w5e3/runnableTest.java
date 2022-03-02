package w5e3;

public class runnableTest implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("DONE");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new runnableTest());
            t.start();
        }
    }
}
