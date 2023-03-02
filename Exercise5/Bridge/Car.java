package Exercise5.Bridge;

class Car extends Vehicle {
    
    public Car(Engine engine) {
        super(engine);
    }

    @Override
    void Drive() {
        System.out.println("This is a car!");
        engine.StartEngine();
    }
}
