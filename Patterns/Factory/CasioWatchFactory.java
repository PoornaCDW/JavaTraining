package Patterns.Factory;

class CasioWatchFactory extends WatchFactory {
    public CasioWatchFactory() {
        System.out.println("Casio watch manufactured!!");
    }

    @Override
    public Watch makeWatch() {
        return new DigitalWatch();
    }
}