package Day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Day5_1 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        
        es.execute(()-> {
            even();
        });

        es.execute(()-> {
            odd();
        });
        
        es.shutdown();
    }

    synchronized public static void even() {
        System.out.println("Printing Even numbers from 1 to 100");
        for(int i=2; i<=100; i+=2)
                System.out.print(" "+i);
        System.out.println();
    }

    synchronized public static void odd() {
        System.out.println("Printing Odd numbers from 1 to 100");
        for(int i=1; i<=100; i+=2)
            System.out.print(" "+i);
    }
}