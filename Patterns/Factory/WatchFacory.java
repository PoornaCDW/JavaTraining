package Patterns.Factory;

abstract class WatchFactory implements WatchManufacturer {
    @Override
    public abstract Watch makeWatch();
}