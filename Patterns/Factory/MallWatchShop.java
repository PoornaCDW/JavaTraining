package Patterns.Factory;

class MallWatchShop extends WatchShop {
    public MallWatchShop() {
        System.out.println("Mall watch shop!!");
    }

    @Override
    public Watch sellWatch(Customer customer) {
        return getWatch().makeWatch();
    }
}