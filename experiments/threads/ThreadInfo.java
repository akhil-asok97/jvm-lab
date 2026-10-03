package threads;

public class ThreadInfo {

    static void main(String[] args) {

        Thread worker = new Thread(() -> {
            System.out.println("Thread Name " + Thread.currentThread().getName());
            System.out.println("Thread ID " + Thread.currentThread().threadId());
            System.out.println("Thread active count " + Thread.activeCount());
            System.out.println("Thread isAlive " + Thread.currentThread().isAlive());
            System.out.println("Thread isDaemon thread " + Thread.currentThread().isDaemon());
        });

        worker.start();


        System.out.println(
                "Available processors: " +
                        Runtime.getRuntime().availableProcessors()
        );

    }
}
