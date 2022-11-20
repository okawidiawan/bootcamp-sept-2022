package day15;

public class ThreadSleepExample extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " is running on " + i + " itteration");
        }
    }
    
    public static void main(String[] args) {
        ThreadSleepExample sleep1 = new ThreadSleepExample();
        
    }
}
