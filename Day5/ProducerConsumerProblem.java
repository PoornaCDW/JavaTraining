package Day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Inventory i = new Inventory();

        es.execute(()-> {
            for(int n=0; n<4; n++)
                i.produceProduct();
        });

        es.execute(()-> {
            for(int n=0; n<4; n++)
                i.consumeProduct();
        });

        es.shutdown();
    }
}

class Inventory {
    int productCount;

    Inventory() {
        productCount = 0;
    }
    
    synchronized public void produceProduct() {
        if(productCount != 0) {
            try{wait();}catch(Exception e) {}
        }
        try{Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}
        System.out.println("Producing the product!");
        productCount++;
        notify();
    }

    synchronized public void consumeProduct() {
        if(productCount == 0) {
            try{wait();}catch(Exception e) {}
        }
        try{Thread.sleep(500);}catch(Exception e) {e.printStackTrace();}
        System.out.println("Consuming the product!");
        productCount = 0;
        notify();
    }
}