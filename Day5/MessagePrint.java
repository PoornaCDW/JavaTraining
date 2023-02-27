package Day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MessagePrint {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        MultiThreadAccess multiThreadAccess = new MultiThreadAccess();

        synchronized(multiThreadAccess){
            executorService.execute(()->{
                multiThreadAccess.printMessage("Hello");
            });
        }

        synchronized(multiThreadAccess){
            executorService.execute(()->{
                multiThreadAccess.printMessage("this is");
            });
        }

        synchronized(multiThreadAccess){
            executorService.execute(()->{
                multiThreadAccess.printMessage("Poorna!");
            });
        }

        executorService.shutdown();
    }
}

class MultiThreadAccess {
   void printMessage(String message) {
        System.out.print("[------");
        System.out.print(message);
        System.out.print("------]");
        System.out.println();
    }
}