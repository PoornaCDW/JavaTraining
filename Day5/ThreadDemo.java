package Day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);

        Thread t = new Thread();
        t.start();

        es.execute(()->{
            t.start();
        });
        
    }
}