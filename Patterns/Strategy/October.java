package Patterns.Strategy;

class October extends Month {
    public October() {
        System.out.println("This is October!");
    }

    @Override
    void printDays() {
        System.out.println("31 Days!");
    }
}