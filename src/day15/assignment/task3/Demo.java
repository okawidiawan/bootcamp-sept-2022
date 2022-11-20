package day15.assignment.task3;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihMenu;
        do {
            System.out.println("MENU");
            System.out.println("1. Buat Simple Thread");
            System.out.println("2. Buat Thread Pool");
            System.out.println("3. Sub Menu (Multi Thread)");
            System.out.println("4. Exit");
            System.out.print("Pilih Menu : ");
            pilihMenu = input.nextInt();
            input.nextLine();
            System.out.println("");

            switch (pilihMenu) {
                case 1 -> {
                    SimpleThread st = new SimpleThread();
                    st.start();
                }
                case 2 -> {
                    SimpleThread st = new SimpleThread();
                    ExecutorService threadPool = Executors.newFixedThreadPool(5);
                    threadPool.execute(st);
                }
                case 3 -> {
                    SimpleThread st = new SimpleThread();
                    st.start();
                    ReadAndSort asc = new ReadAndSort("asc");
                    asc.start();
                    ReadAndSort desc = new ReadAndSort("desc");
                    desc.start();

                }
            }
        } while (pilihMenu != 4);
    }

}
