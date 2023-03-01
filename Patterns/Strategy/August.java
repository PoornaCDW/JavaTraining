package Patterns.Strategy;

class August extends Month {
    public August() {
        System.out.println("This is August!");
    }

    @Override
    void printDays() {
        System.out.println("31 Days!");
    }
}
