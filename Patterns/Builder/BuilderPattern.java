package Patterns.Builder;

public class BuilderPattern {
    public static void main(String[] args) {
        Building myBuilding = new Building.BuildHouse().setBricks("7000 Bricks").setCementLoad("60 KGs").setPaintLoad("15L White Paint").setWoodType("Teak Wood").build();
        System.out.println();
        System.out.println(myBuilding);
    }
}