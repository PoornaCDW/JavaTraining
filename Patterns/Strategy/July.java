package Patterns.Strategy;

class July extends Month {
    public July() {
        System.out.println("This is July!");
    }

    @Override
    void printDays() {
        System.out.println("31 Days!");
    }
}