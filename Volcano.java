class Volcano {
    int id;
    String name;
    double altitude;
    int lastEruption;
    String cityFound;
    double magmaTemp;
    String type;
    int dangerRank;
    double gasEmission;
    int recordedEruptions;
    String country;
    boolean isActive;

    Volcano(int id) {
        this.id = id;
        System.out.println("Volcano Id: " + id);
    }

    Volcano(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    Volcano(double altitude) {
        this.altitude = altitude;
        System.out.println("Alt: " + altitude);
    }

    Volcano(int lastEruption, String cityFound) {
        this.lastEruption = lastEruption;
        this.cityFound = cityFound;
        System.out.println("Year: " + lastEruption);
        System.out.println("Near: " + cityFound);
    }

    Volcano(double magmaTemp, String type, int dangerRank) {
        this.magmaTemp = magmaTemp;
        this.type = type;
        this.dangerRank = dangerRank;
        System.out.println("Temp: " + magmaTemp);
        System.out.println("Type: " + type);
        System.out.println("Rank: " + dangerRank);
    }

    Volcano(double gasEmission, int recordedEruptions) {
        this.gasEmission = gasEmission;
        this.recordedEruptions = recordedEruptions;
        System.out.println("Gas: " + gasEmission);
        System.out.println("Total: " + recordedEruptions);
    }

    Volcano(String country, boolean isActive) {
        this.country = country;
        this.isActive = isActive;
        System.out.println("In: " + country);
        System.out.println("Active: " + isActive);
    }
}