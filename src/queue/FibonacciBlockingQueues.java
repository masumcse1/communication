package queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class FibonacciBlockingQueues {


    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);

        new Thread(new FibonacciCreator(queue)).start();
        new Thread(new FibonacciPrinter(queue)).start();
    }

}
