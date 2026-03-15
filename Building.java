class Building {
    int id;
    String name;
    double cost;
    int floors;
    String city;
    double height;
    String material;
    int yearBuilt;
    double landArea;
    int elevators;
    String architect;
    boolean hasParking;

    Building(int id) {
        this.id = id;
        System.out.println("Building Id: " + id);
    }

    Building(String name) {
        this.name = name;
        System.out.println("Building: " + name);
    }

    Building(double cost) {
        this.cost = cost;
        System.out.println("Cost: " + cost);
    }

    Building(int floors, String city) {
        this.floors = floors;
        this.city = city;
        System.out.println("Floors: " + floors);
        System.out.println("City: " + city);
    }

    Building(double height, String material, int yearBuilt) {
        this.height = height;
        this.material = material;
        this.yearBuilt = yearBuilt;
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
        System.out.println("Year: " + yearBuilt);
    }

    Building(double landArea, int elevators) {
        this.landArea = landArea;
        this.elevators = elevators;
        System.out.println("Area: " + landArea);
        System.out.println("Lifts: " + elevators);
    }

    Building(String architect, boolean hasParking) {
        this.architect = architect;
        this.hasParking = hasParking;
        System.out.println("Design by: " + architect);
        System.out.println("Parking: " + hasParking);
    }
}