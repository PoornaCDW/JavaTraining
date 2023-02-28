package Patterns.Factory;

class TitanWatchFactory extends WatchFactory{
    public TitanWatchFactory() {
        System.out.println("Titan Watch manufactured!!");
    }
    @Override
    public Watch makeWatch() {
        return new AnalogWatch();
    }
}