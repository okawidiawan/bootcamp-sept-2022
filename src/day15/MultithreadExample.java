package day15;

public class MultithreadExample extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Thread is Running...");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MultithreadExample t = new MultithreadExample();
            t.setName("Thread " + i);
            t.start();
        }
    }
}
