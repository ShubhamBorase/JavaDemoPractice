import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SimpleThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with 5 threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Create and submit tasks to the thread pool
        for (int i = 0; i < 10; i++) {
            Runnable task = new MyTask(i);
            executorService.submit(task);
        }

        // Shutdown the thread pool (wait for tasks to finish)
        executorService.shutdown();
    }

    static class MyTask implements Runnable {
        private int taskId;

        public MyTask(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            // Simulate some work
            System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // Simulate task duration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task " + taskId + " is finished.");
        }
    }
}
