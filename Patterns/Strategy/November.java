package Patterns.Strategy;

class November extends Month {
    public November() {
        System.out.println("This is November!");
    }

    @Override
    void printDays() {
        System.out.println("30 Days!");
    }
}
