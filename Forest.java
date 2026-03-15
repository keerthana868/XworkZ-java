class Forest {
    int id;
    String name;
    double rainfall;
    int treeCount;
    String location;
    double density;
    String treeType;
    int humidityPercent;
    double area;
    int fireRecords;
    String rangerName;
    boolean isProtected;

    Forest(int id) {
        this.id = id;
        System.out.println("Forest Id: " + id);
    }

    Forest(String name) {
        this.name = name;
        System.out.println("Forest: " + name);
    }

    Forest(double rainfall) {
        this.rainfall = rainfall;
        System.out.println("Rain: " + rainfall);
    }

    Forest(int treeCount, String location) {
        this.treeCount = treeCount;
        this.location = location;
        System.out.println("Trees: " + treeCount);
        System.out.println("Loc: " + location);
    }

    Forest(double density, String treeType, int humidityPercent) {
        this.density = density;
        this.treeType = treeType;
        this.humidityPercent = humidityPercent;
        System.out.println("Density: " + density);
        System.out.println("Type: " + treeType);
        System.out.println("Hum: " + humidityPercent);
    }

    Forest(double area, int fireRecords) {
        this.area = area;
        this.fireRecords = fireRecords;
        System.out.println("Area: " + area);
        System.out.println("Fires: " + fireRecords);
    }

    Forest(String rangerName, boolean isProtected) {
        this.rangerName = rangerName;
        this.isProtected = isProtected;
        System.out.println("Ranger: " + rangerName);
        System.out.println("Safe: " + isProtected);
    }
}