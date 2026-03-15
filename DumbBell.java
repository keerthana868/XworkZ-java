class DumbBell {
    double weight;
    String material;
    String gripType;
    String brand;
    String color;
    boolean isAdjustable;
    double handleDiameter;
    String shape; // Hex, Round
    double price;
    int warrantyMonths;
    boolean rustResistant;
    String countryOfOrigin;
    String coating; // Rubber, Neoprene, Vinyl
    double totalLength;
    boolean soldAsPair;
    String usageLevel; // Commercial, Home
    int stockUnits;
    boolean antiRollFeature;
    String storageRackIncluded;
    double gripLength;

    DumbBell(double weight, String material, String gripType, String brand, String color, boolean isAdjustable, double handleDiameter, String shape, double price, int warrantyMonths, boolean rustResistant, String countryOfOrigin, String coating, double totalLength, boolean soldAsPair, String usageLevel, int stockUnits, boolean antiRollFeature, String storageRackIncluded, double gripLength) {
        this.weight = weight;
        this.material = material;
        this.gripType = gripType;
        this.brand = brand;
        this.color = color;
        this.isAdjustable = isAdjustable;
        this.handleDiameter = handleDiameter;
        this.shape = shape;
        this.price = price;
        this.warrantyMonths = warrantyMonths;
        this.rustResistant = rustResistant;
        this.countryOfOrigin = countryOfOrigin;
        this.coating = coating;
        this.totalLength = totalLength;
        this.soldAsPair = soldAsPair;
        this.usageLevel = usageLevel;
        this.stockUnits = stockUnits;
        this.antiRollFeature = antiRollFeature;
        this.storageRackIncluded = storageRackIncluded;
        this.gripLength = gripLength;
    }

    void display() {
        System.out.println("Brand: " + brand + " | Weight: " + weight + "kg | Material: " + material);
        System.out.println("Adjustable: " + isAdjustable + " | Price: $" + price + " | Coating: " + coating);
        System.out.println("--------------------------------");
    }
}