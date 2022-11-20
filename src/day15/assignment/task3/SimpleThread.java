package day15.assignment.task3;

public class SimpleThread extends Thread {

    public void run() {
        System.out.println("Print Thread");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " is processing " + i);
        }
    }

}
