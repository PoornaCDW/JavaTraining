package Patterns.Strategy;

class April extends Month {
    public April() {
        System.out.println("This is April!");
    }

    @Override
    void printDays() {
        System.out.println("30 Days!");
    }
}