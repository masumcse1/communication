package queue;

import java.util.concurrent.BlockingQueue;

class FibonacciPrinter implements Runnable {
    private BlockingQueue<Integer> queue;

    FibonacciPrinter(BlockingQueue<Integer> queue) { this.queue = queue; }

    public void run() { print(); }

    void print() {
        try {
            int item;
            while ((item = queue.take()) != -1)    
                System.out.println("Printed: " + item);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}