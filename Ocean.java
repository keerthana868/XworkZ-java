class Ocean {
    int id;
    String name;
    double avgDepth;
    int speciesCount;
    String location;
    double surfaceArea;
    String mainCurrent;
    int islandCount;
    double temperature;
    int discoveryYear;
    String deepestPoint;
    boolean isFreezing;

    Ocean(int id) {
        this.id = id;
        System.out.println("Ocean Id: " + id);
    }

    Ocean(String name) {
        this.name = name;
        System.out.println("Ocean: " + name);
    }

    Ocean(double avgDepth) {
        this.avgDepth = avgDepth;
        System.out.println("Depth: " + avgDepth);
    }

    Ocean(int speciesCount, String location) {
        this.speciesCount = speciesCount;
        this.location = location;
        System.out.println("Species: " + speciesCount);
        System.out.println("Loc: " + location);
    }

    Ocean(double surfaceArea, String mainCurrent, int islandCount) {
        this.surfaceArea = surfaceArea;
        this.mainCurrent = mainCurrent;
        this.islandCount = islandCount;
        System.out.println("Area: " + surfaceArea);
        System.out.println("Current: " + mainCurrent);
        System.out.println("Islands: " + islandCount);
    }

    Ocean(double temperature, int discoveryYear) {
        this.temperature = temperature;
        this.discoveryYear = discoveryYear;
        System.out.println("Temp: " + temperature);
        System.out.println("Year: " + discoveryYear);
    }

    Ocean(String deepestPoint, boolean isFreezing) {
        this.deepestPoint = deepestPoint;
        this.isFreezing = isFreezing;
        System.out.println("Deepest: " + deepestPoint);
        System.out.println("Frozen: " + isFreezing);
    }
}