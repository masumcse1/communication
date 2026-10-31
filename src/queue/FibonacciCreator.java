package queue;

import java.util.concurrent.BlockingQueue;

class FibonacciCreator implements Runnable {
    private BlockingQueue<Integer> queue;

    FibonacciCreator(BlockingQueue<Integer> queue) { this.queue = queue; }

    public void run() { create(); }

    void create() {
        try {
            int a = 0, b = 1;
            for (int i = 0; i < 10; i++) {
                queue.put(a);
                int c = a + b;
                a = b;
                b = c;
            }
            queue.put(-1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}