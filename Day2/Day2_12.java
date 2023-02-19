class Wipro {
    private int yearFounded;

    public Wipro(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    void getDesc() {
        System.out.println("Wipro Company(super)!");
    }
}

class WiproTechnologies extends Wipro {
    WiproTechnologies(int y) {
        super(y);
    }
    
    @Override
    void getDesc() {
        System.out.println("This is Wipro Technologies:");
        System.out.println("Wipro Limited is an Indian multinational corporation that provides information technology, consulting and business process services.");
    }
}

class WiproInfoTech extends Wipro {
    WiproInfoTech(int y) {
        super(y);
    }
    
    @Override
    void getDesc() {
        System.out.println("This is Wipro Infotech:");
        System.out.println("Wipro Infotech, a division of the US $6 billion Wipro Limited, provides enterprise customers with high value Information Technology Products, Software Services, Solutions and Consulting Services in India and the Middle East.");    
    }
}

class WiproBPO extends Wipro {
    WiproBPO(int y) {
        super(y);
    }
    
    @Override
    void getDesc() {
        System.out.println("This is Wipro BPO:");
        System.out.println("Wipro BPO Solutions Ltd. provides end-to-end business process outsourcing and customer interaction services. The Company offers email management, inbound & outbound voice processes, and web based services for commercial customer throughout India.");
    }
}

public class Day2_12 {
    public static void main(String[] args) {
        Wipro []wcs = new Wipro[3];
        wcs[0] = new WiproTechnologies(1990);
        wcs[1] = new WiproInfoTech(1980);
        wcs[2] = new WiproBPO(2002);

        for(Wipro w : wcs) {
            w.getDesc();
            System.out.println();
        }
    }    
}