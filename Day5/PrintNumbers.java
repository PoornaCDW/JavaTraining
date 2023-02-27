package Day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintNumbers {
    public static void main(String[] args) {
        ExecutorService Threads = Executors.newFixedThreadPool(2);
        
        Threads.execute(()-> {
            even();
        });

        Threads.execute(()-> {
            odd();
        });
        
        Threads.shutdown();
    }

    public static void even() {
        System.out.println("Printing Even numbers from 1 to 100");
        for(int i=2; i<=100; i+=2)
                System.out.print(" "+i);
        System.out.println();
    }

    public static void odd() {
        System.out.println("Printing Odd numbers from 1 to 100");
        for(int i=1; i<=100; i+=2)
            System.out.print(" "+i);
    }
}