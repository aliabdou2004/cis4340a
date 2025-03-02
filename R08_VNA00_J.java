public class R08_VNA00_J {
    private int counter;

    public static void main(String[] args) {
        R08_VNA00_J example = new R08_VNA00_J();
        example.incrementCounter();
        System.out.println("Counter: " + example.getCounter());
    }

    public void incrementCounterNonCompliant() {
        counter++;
    }

    public synchronized void incrementCounter() {
        counter++;
    }

    public synchronized int getCounter() {
        return counter;
    }
}
