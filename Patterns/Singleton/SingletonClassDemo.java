package Patterns.Singleton;

public class SingletonClassDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.toPrint();
        Singleton singleton2 = Singleton.getInstance();
        singleton2.toPrint();
    }
}
