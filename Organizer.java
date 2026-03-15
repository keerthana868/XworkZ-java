class Organizer {
    String brand;
    String type;
    double price;
    int compartmentCount;
    String material;
    String color;
    boolean isExpandable;
    double weightKg;
    String dimensions;
    boolean isWaterproof;
    String manufacturer;
    int warrantyMonths;
    boolean assemblyRequired;
    String style;
    double loadCapacityKg;
    boolean isPortable;
    String countryOfOrigin;
    String mountingType;
    boolean ecoFriendly;
    int stockCount;

    Organizer(String brand, String type, double price, int compartmentCount, String material, String color, boolean isExpandable, double weightKg, String dimensions, boolean isWaterproof, String manufacturer, int warrantyMonths, boolean assemblyRequired, String style, double loadCapacityKg, boolean isPortable, String countryOfOrigin, String mountingType, boolean ecoFriendly, int stockCount) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.compartmentCount = compartmentCount;
        this.material = material;
        this.color = color;
        this.isExpandable = isExpandable;
        this.weightKg = weightKg;
        this.dimensions = dimensions;
        this.isWaterproof = isWaterproof;
        this.manufacturer = manufacturer;
        this.warrantyMonths = warrantyMonths;
        this.assemblyRequired = assemblyRequired;
        this.style = style;
        this.loadCapacityKg = loadCapacityKg;
        this.isPortable = isPortable;
        this.countryOfOrigin = countryOfOrigin;
        this.mountingType = mountingType;
        this.ecoFriendly = ecoFriendly;
        this.stockCount = stockCount;
    }

    void display() {
        System.out.println("Organizer: " + brand + " (" + type + ") | Material: " + material);
        System.out.println("Compartments: " + compartmentCount + " | Capacity: " + loadCapacityKg + "kg | Price: $" + price);
        System.out.println("--------------------------------");
    }
}