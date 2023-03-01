package Patterns.Strategy;

public class January extends Month {
    public January() {
        System.out.println("This is January!");
    }

    @Override
    void printDays() {
        System.out.println("31 Days!");
    }
}