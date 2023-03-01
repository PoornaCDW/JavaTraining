package Patterns.Strategy;

class September extends Month {
    public September() {
        System.out.println("This is September!");
    }

    @Override
    void printDays() {
        System.out.println("30 Days!");
    }
}