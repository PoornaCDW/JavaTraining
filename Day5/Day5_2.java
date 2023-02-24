package Day5;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Day5_2 {
    public static void main(String[] args) {
        String msg = "[------Message------]";

        new ForkJoinPool();
        ForkJoinPool fjp = ForkJoinPool.commonPool();

        MyTask t1 = new MyTask(msg, 0, 7);
        MyTask t2 = new MyTask(msg, 7, 14);
        MyTask t3 = new MyTask(msg, 14, 21);

        fjp.invoke(t1);
        fjp.invoke(t2);
        fjp.invoke(t3);
    }
}

class MyTask extends RecursiveTask<String> {
    String m;
    int start, end;

    public MyTask(String msg, int start, int end) {
        this.m = msg;
        this.start = start;
        this.end = end;
    }

    @Override
    protected String compute() {
        for(int i=start; i<end; i++)
            System.out.print(m.charAt(i));
        return m;
    }
}