public class R01_DCL00_J {
    private static int counter;

    public static void main(String[] args) {
        incrementCounterNonCompliant();
        System.out.println("Counter (Non-Compliant): " + counter);

        incrementCounter();
        System.out.println("Counter (Compliant): " + counter);
    }

    public static void incrementCounterNonCompliant() {
        counter++;
    }

    public static void incrementCounter() {
        counter = 0;
        counter++;
    }
}
