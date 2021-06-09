package thread_producer_consumer;

import java.util.ArrayDeque;
import java.util.Queue;

public class Demo {
    public static void main(String[] args) {

        Queue<Product> queue = new ArrayDeque<>();

        Producer producer = new Producer(queue, 100);
        Consumer consumer = new Consumer(queue, 100);

        for (int i = 0; i < 1000; i++) {
            new Thread(producer).start();
            new Thread( consumer).start();

        }
    }

}
