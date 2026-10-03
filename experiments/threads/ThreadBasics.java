package threads;

public class ThreadBasics {

    static void main(String[] args) throws InterruptedException {

        for (int i = 0; i <= 5; i++) {
            int taskId = i;
            Thread worker = new Thread(() -> {
                System.out.println("Task " + taskId + " running on " + Thread.currentThread().getName());


                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println(
                        "Task " + taskId +
                                " finished on " +
                                Thread.currentThread().getName()
                );
            });

            worker.start(); // Make this thread eligible to be scheduled.

            // worker.join(); // enables sequential execution by marrying the worker thread to the main thread.
        }
    }
}