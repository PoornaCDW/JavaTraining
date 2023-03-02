package Exercise5.Bridge;

class ElectricEngine extends Engine {
    
    @Override
    void StartEngine() {
        System.out.println("This vehicle has an electric engine!");
    }
}
