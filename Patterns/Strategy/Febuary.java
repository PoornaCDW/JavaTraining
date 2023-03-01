package Patterns.Strategy;

class Febuary extends Month {
    public Febuary() {
        System.out.println("This is February!");
    }

    @Override
    void printDays() {
        System.out.println("28 Days!");
    }
}
