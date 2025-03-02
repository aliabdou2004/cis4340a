public class R10_THI00_J {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    // Thread's work here
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); 
            }
        });

        thread.start();

        // thread stop
        thread.interrupt();
    }
}
