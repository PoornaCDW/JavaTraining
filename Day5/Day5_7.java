package Day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Day5_7 {
    static int seconds = 0, secondsCount = 0;
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);

        es.execute(()->{
            for(int i=1; i<=100; i++) {
                System.out.println("Counting: "+i);
                try {
                    Thread.sleep(1000);
                    secondsCount++;
                }catch(Exception e){}
                if(secondsCount%10 == 0)
                    System.out.println("Reached "+(seconds+=10)+" seconds!");
            }
        });

        es.shutdown();
    }
}