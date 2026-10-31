package communication;

class Producer extends Thread {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        int a = 0, b = 1;
        for (int i = 0; i < 10; i++) {
            resource.create(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
