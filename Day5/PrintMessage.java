package Day5;

import java.util.concurrent.ForkJoinPool;

public class PrintMessage {
    public static void main(String[] args) {
        String msg = "[------Message------]";

        //new ForkJoinPool();
        ForkJoinPool fjp = ForkJoinPool.commonPool();

        MyTask t1 = new MyTask(msg, 0, 7);
        MyTask t2 = new MyTask(msg, 7, 14);
        MyTask t3 = new MyTask(msg, 14, 21);

        fjp.invoke(t1);
        fjp.invoke(t2);
        fjp.invoke(t3);
    }
}