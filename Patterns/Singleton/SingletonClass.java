package Patterns.Singleton;

class Singleton {
    static Singleton singletonInstance;

    private Singleton() {
        System.out.println("Constructor called!!");
    }

    public static synchronized Singleton getInstance() {
        if(singletonInstance == null)
            singletonInstance = new Singleton();
        
        return singletonInstance;
    }

    public void toPrint() {
        System.out.println("toPrint method called!");
    }
}