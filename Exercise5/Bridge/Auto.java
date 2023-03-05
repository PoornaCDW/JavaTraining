package Exercise5.Bridge;

class Auto extends Vehicle {
    
    public Auto(Engine engine) {
        super(engine);
    }

    @Override
    void Drive() {
        System.out.println("This is an auto(3-Wheeler)!");
        engine.StartEngine();
    }
}