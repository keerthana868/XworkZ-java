class Conditioner {
    String brand;
    String type;
    double price;
    double volumeMl;
    String hairType;
    boolean isParabenFree;
    String scent;
    int hydrationLevel; // 1-10
    boolean colorSafe;
    String manufacturer;
    int shelfLifeMonths;
    String texture;
    boolean rinseRequired;
    double phValue;
    String targetConcern;
    boolean organic;
    String primaryOil;
    int usageFrequencyPerWeek;
    boolean crueltyFree;
    int stockCount;

    Conditioner(String brand, String type, double price, double volumeMl, String hairType, boolean isParabenFree, String scent, int hydrationLevel, boolean colorSafe, String manufacturer, int shelfLifeMonths, String texture, boolean rinseRequired, double phValue, String targetConcern, boolean organic, String primaryOil, int usageFrequencyPerWeek, boolean crueltyFree, int stockCount) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.volumeMl = volumeMl;
        this.hairType = hairType;
        this.isParabenFree = isParabenFree;
        this.scent = scent;
        this.hydrationLevel = hydrationLevel;
        this.colorSafe = colorSafe;
        this.manufacturer = manufacturer;
        this.shelfLifeMonths = shelfLifeMonths;
        this.texture = texture;
        this.rinseRequired = rinseRequired;
        this.phValue = phValue;
        this.targetConcern = targetConcern;
        this.organic = organic;
        this.primaryOil = primaryOil;
        this.usageFrequencyPerWeek = usageFrequencyPerWeek;
        this.crueltyFree = crueltyFree;
        this.stockCount = stockCount;
    }

    void display() {
        System.out.println("Conditioner: " + brand + " (" + type + ") | Price: $" + price);
        System.out.println("Concern: " + targetConcern + " | Oil: " + primaryOil + " | pH: " + phValue);
        System.out.println("--------------------------------");
    }
}