package Exercise5.Bridge;

public class BridgePattern {
    public static void main(String[] args) {
        Vehicle Mustang = new Car(new PetrolEngine());
        Vehicle Scania = new Truck(new DieselEngine());

        Mustang.Drive();
        Scania.Drive();
    }
}