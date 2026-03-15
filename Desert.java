class Desert {
    int id;
    String name;
    double maxTemp;
    int animalSpecies;
    String location;
    double area;
    String country;
    int annualRainfall;
    double longitude;
    int sandDunes;
    String type;
    boolean hasOasis;

    Desert(int id) {
        this.id = id;
        System.out.println("Desert Id: " + id);
    }

    Desert(String name) {
        this.name = name;
        System.out.println("Desert: " + name);
    }

    Desert(double maxTemp) {
        this.maxTemp = maxTemp;
        System.out.println("Temp: " + maxTemp);
    }

    Desert(int animalSpecies, String location) {
        this.animalSpecies = animalSpecies;
        this.location = location;
        System.out.println("Species: " + animalSpecies);
        System.out.println("Loc: " + location);
    }

    Desert(double area, String country, int annualRainfall) {
        this.area = area;
        this.country = country;
        this.annualRainfall = annualRainfall;
        System.out.println("Area: " + area);
        System.out.println("In: " + country);
        System.out.println("Rain: " + annualRainfall);
    }

    Desert(double longitude, int sandDunes) {
        this.longitude = longitude;
        this.sandDunes = sandDunes;
        System.out.println("Long: " + longitude);
        System.out.println("Dunes: " + sandDunes);
    }

    Desert(String type, boolean hasOasis) {
        this.type = type;
        this.hasOasis = hasOasis;
        System.out.println("Type: " + type);
        System.out.println("Oasis: " + hasOasis);
    }
}
