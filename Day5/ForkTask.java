package Day5;

import java.util.concurrent.RecursiveTask;

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