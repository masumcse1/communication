package communication;

public class FibonacciThreads {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        new Producer(resource).start();
        new Consumer(resource).start();
    }
}
