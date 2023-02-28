package Patterns.Factory;

abstract class WatchShop implements WatchSeller {
    private WatchFactory watchFactory;

    public void setFactory(WatchFactory watchFactory) {
        this.watchFactory = watchFactory;
    }

    public WatchFactory getWatch() {
        return this.watchFactory;
    }

    public abstract Watch sellWatch(Customer customer);
}