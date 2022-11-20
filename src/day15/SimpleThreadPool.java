package day15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 100; i++) {
            Task task = new Task("Exe " + i);
            threadPool.execute(task);
        }
        threadPool.shutdown();
        while(threadPool.isTerminated()){
            System.out.println("Finished all thread");
        }
    }
}
