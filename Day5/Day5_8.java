package Day5;


public class Day5_8 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("A");

        ThreadExtension t1 = new ThreadExtension(stringBuffer);
        ThreadExtension t2 = new ThreadExtension(stringBuffer);
        ThreadExtension t3 = new ThreadExtension(stringBuffer);

        t1.start();
        t2.start();
        t3.start();
    }
}

class ThreadExtension extends Thread {
    StringBuffer sBuffer;

    ThreadExtension(StringBuffer stringBuffer) {
        sBuffer = stringBuffer;
    }

    @Override
    public void run() {
        synchronized(sBuffer) {
            for(int i=1; i<=100; i++)
                System.out.print(sBuffer);
            System.out.println();
            char c = sBuffer.charAt(0);
            c++;
            String temp = Character.toString(c);
            sBuffer.replace(0, 1, temp);
        }
    }
}