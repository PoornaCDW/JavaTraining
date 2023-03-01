package Patterns.Strategy;

class June extends Month {
    public June() {
        System.out.println("This is June!");
    }

    @Override
    void printDays() {
        System.out.println("30 Days!");
    }
}