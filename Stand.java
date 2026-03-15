class Stand {
    String material;
    String type;
    double height;
    double weightCapacity;
    String color;
    double price;
    String brand;
    boolean isFoldable;
    boolean isAdjustable;
    int legCount;
    String finish;
    double baseDiameter;
    boolean hasWheels;
    String assemblyRequired;
    int warrantyMonths;
    double productWeight;
    String gripMaterial;
    boolean waterProof;
    String countryOfOrigin;
    int stockUnits;

    Stand(String material, String type, double height, double weightCapacity, String color, double price, String brand, boolean isFoldable, boolean isAdjustable, int legCount, String finish, double baseDiameter, boolean hasWheels, String assemblyRequired, int warrantyMonths, double productWeight, String gripMaterial, boolean waterProof, String countryOfOrigin, int stockUnits) {
        this.material = material;
        this.type = type;
        this.height = height;
        this.weightCapacity = weightCapacity;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.isFoldable = isFoldable;
        this.isAdjustable = isAdjustable;
        this.legCount = legCount;
        this.finish = finish;
        this.baseDiameter = baseDiameter;
        this.hasWheels = hasWheels;
        this.assemblyRequired = assemblyRequired;
        this.warrantyMonths = warrantyMonths;
        this.productWeight = productWeight;
        this.gripMaterial = gripMaterial;
        this.waterProof = waterProof;
        this.countryOfOrigin = countryOfOrigin;
        this.stockUnits = stockUnits;
    }

    void display() {
        System.out.println("Brand: " + brand + " | Type: " + type + " | Material: " + material);
        System.out.println("Price: $" + price + " | Capacity: " + weightCapacity + "kg");
        System.out.println("--------------------------------");
    }
}