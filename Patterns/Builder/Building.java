package Patterns.Builder;

class Building {
    class House{
        String cementLoad, bricksCount, paintLoad, woodType;

        public House(String cementLoad,String bricksCount,String paintLoad,String woodType) {
            this.cementLoad = cementLoad;
            this.bricksCount = bricksCount;
            this.paintLoad = paintLoad;
            this.bricksCount = bricksCount;
        }

        @Override
        public String toString() {
            return "House [Cement Load: "+cementLoad+", Bricks Count: "+bricksCount+", Paint Load: "+paintLoad+", Wood Type"+woodType+"]";
        }
    }

    House house;
    String houseBuilder;

    public Building(BuildHouse buildHouse) {
        house = new House(buildHouse.cementLoad, buildHouse.bricksCount, buildHouse.paintLoad, buildHouse.woodType);
        houseBuilder = "HariHaran Constructions";
    }

    @Override
    public String toString() {
        return "Building [house: "+house+", BuilderName: "+houseBuilder+"]";
    }
    
    static class BuildHouse {
        String cementLoad, bricksCount, paintLoad, woodType;

        public BuildHouse setCementLoad(String cementLoad) {
            this.cementLoad = cementLoad;
            return this;
        }

        public BuildHouse setBricks(String bricksCount) {
            this.bricksCount = bricksCount;
            return this;
        }

        public BuildHouse setPaintLoad(String paintLoad) {
            this.paintLoad = paintLoad;
            return this;
        }

        public BuildHouse setWoodType(String woodType) {
            this.woodType = woodType;
            return this;
        }

        public Building build() {
            return new Building(this);
        }
    }
}