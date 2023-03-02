package Exercise5.Bridge;

abstract class Vehicle {
    Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    abstract void Drive();
}