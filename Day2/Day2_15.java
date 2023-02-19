class Door {
    double height;
    double width;
    
    public Door(double height, double width) {
        this.height = height;
        this.width = width;
    }
    
    public double getArea() {
        return height * width;
    }
    
    public double getCost(double costPerSqFt) {
        return costPerSqFt * getArea();
    }
}

class Window {
    double height;
    double width;
    
    public Window(double height, double width) {
        this.height = height;
        this.width = width;
    }
    
    public double getArea() {
        return height * width;
    }
    
    public double getCost(double costPerSqFt) {
        return costPerSqFt * getArea();
    }
}

class House {
    Door door;
    Window window;
    double doorArea;
    double windowArea;
    double doorCostPerSqFt;
    double windowCostPerSqFt;
    
    public House(double doorHeight, double doorWidth, double windowHeight, double windowWidth,
                 double doorArea, double windowArea, double doorCostPerSqFt, double windowCostPerSqFt) {
        door = new Door(doorHeight, doorWidth);
        window = new Window(windowHeight, windowWidth);
        this.doorArea = doorArea;
        this.windowArea = windowArea;
        this.doorCostPerSqFt = doorCostPerSqFt;
        this.windowCostPerSqFt = windowCostPerSqFt;
    }
    
    public double getDoorCost() {
        return door.getCost(doorCostPerSqFt) * doorArea;
    }
    
    public double getWindowCost() {
        return window.getCost(windowCostPerSqFt) * windowArea;
    }
    
    public double getTotalCost() {
        return getDoorCost() + getWindowCost();
    }
}

public class Day2_15 {
    public static void main(String[] args) {
        House house = new House(7.0, 3.0, 4.0, 5.0, 3.0, 5.0, 100.0, 80.0);
        double totalCost = house.getTotalCost();
        System.out.println("Total cost of constructing the house: " + totalCost);
    }
}
