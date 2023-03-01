package Patterns.Strategy;

class March extends Month {
    public March() {
        System.out.println("This is March!");
    }

    @Override
    void printDays() {
        System.out.println("31 Days!");
    }
}
