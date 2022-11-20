package day15;

public class MultithreadRunnableExample implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            MultithreadRunnableExample runnable = new MultithreadRunnableExample();
            Thread t = new Thread(runnable);
            t.setName("Thread " + i);
            t.start();
        }
    }
}
