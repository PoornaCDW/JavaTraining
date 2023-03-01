package Patterns.Strategy;

class May extends Month {
    public May() {
        System.out.println("This is May!");
    }

    @Override
    void printDays() {
        System.out.println("31 Days!");
    }
}
