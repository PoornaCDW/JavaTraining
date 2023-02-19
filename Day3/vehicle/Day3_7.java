package vehicle;
class Car extends FourWheeler {
    @Override
    public void printNumeberOfWheels() {
        System.out.println("Four wheeled vehocle!");
    }
}

public class Day3_7 {
    public static void main(String[] args) {
        Car c = new Car();
        c.printNumeberOfWheels();
    }
}