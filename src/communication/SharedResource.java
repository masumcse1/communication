package communication;

class SharedResource {
    private int value;
    private boolean available = false;

    public synchronized void create(int n) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value = n;
        available = true;
        notify();
    }

    public synchronized void print() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printed: " + value);
        available = false;
        notify();
    }
}