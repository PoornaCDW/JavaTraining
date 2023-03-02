package Exercise5.Bridge;

class Truck extends Vehicle {
    
    public Truck(Engine engine) {
        super(engine);
    }

    @Override
    void Drive() {
        System.out.println("This is a truck!");
        engine.StartEngine();
    }
}
