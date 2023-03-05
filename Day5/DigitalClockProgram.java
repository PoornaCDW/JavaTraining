package Day5;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DigitalClockProgram {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        DigitalClock dc = new DigitalClock(second, minute, hour);

        ExecutorService es = Executors.newFixedThreadPool(3);

        es.execute(()->{
            while(true)
                dc.forSecond();
        });

        es.execute(()->{
            while(true)
                dc.forMinute();
        });

        es.execute(()->{
            while(true)
                dc.forHour();
        });
    }
}

class DigitalClock {
    int second;
    int minute;
    int hour;

    DigitalClock(int second, int minute, int hour) {
        this.second = second;
        this.hour = hour;
        this.minute = minute;
    }

    synchronized void forSecond() {
        int i;
        if(second < 59) {
            for(i=second; i<60; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(hour+":"+minute+":"+i);
            }
            second = i;
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized void forMinute() {
        if(minute < 59 && second == 60) {
            minute++;
            second = 0;
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized void forHour() {
        if(minute == 59) {
            hour++;
            minute = 0;
            second = 0;
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}