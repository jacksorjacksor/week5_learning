package w5e2;

public class Producer {
    public static void main(String[] args) {
        Buffer myBuffer = new Buffer();
        for (int i = 1; i < 101; i++) {
            myBuffer.put(i);
        }
        System.out.println(myBuffer.get());
    }
}
