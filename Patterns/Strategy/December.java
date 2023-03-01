package Patterns.Strategy;

class December extends Month {
    public December() {
        System.out.println("This is December!");
    }

    @Override
    void printDays() {
        System.out.println("31 Days!");
    }
}
